package br.com.victor.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.victor.listadetarefascompose.componentes.Botao
import br.com.victor.listadetarefascompose.componentes.CaixaDeTexto
import br.com.victor.listadetarefascompose.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SalvarTarefas(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(backgroundColor = GRAY, title = {
                Text(
                    text = "Salvar tarefa",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = BLACK
                )
            })

        },
        backgroundColor = GRAY
    ) {
        var tituloTarefa by remember {
            mutableStateOf("")
        }

        var descricaoTarefa by remember {
            mutableStateOf("")
        }
        var semPrioridade by remember {
            mutableStateOf(false)
        }
        var prioridadeBaixa by remember {
            mutableStateOf(false)
        }
        var prioridadeMedia by remember {
            mutableStateOf(false)
        }
        var prioridadeAlta by remember {
            mutableStateOf(false)
        }



        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            CaixaDeTexto(
                text = tituloTarefa,
                onValueChange = {
                    tituloTarefa = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 20.dp
                    ),
                label = "Titulo tarefa",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )

            CaixaDeTexto(
                text = descricaoTarefa,
                onValueChange = {
                    descricaoTarefa = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 10.dp
                    ),
                label = "Descrição tarefa",
                maxLines = 5,
                keyboardType = KeyboardType.Text
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Nivel de prioridade")
                RadioButton(
                    selected = prioridadeBaixa,
                    onClick = {
                        prioridadeBaixa = !prioridadeBaixa
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_GREEN_DISABLE,
                        selectedColor = RADIO_BUTTON_GREEN_ENABLE
                    )
                )

                RadioButton(
                    selected = prioridadeMedia,
                    onClick = {
                        prioridadeMedia = !prioridadeMedia
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_YELLOW_DISABLE,
                        selectedColor = RADIO_BUTTON_YELLOW_ENABLE
                    )
                )

                RadioButton(
                    selected = prioridadeAlta,
                    onClick = {
                        prioridadeAlta = !prioridadeAlta
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_RED_DISABLE,
                        selectedColor = RADIO_BUTTON_RED_ENABLE
                    )
                )

            }

            Botao(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                text = "Salvar"
            )

        }

    }

}