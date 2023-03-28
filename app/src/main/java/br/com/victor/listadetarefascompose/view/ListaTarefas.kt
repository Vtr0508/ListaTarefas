package br.com.victor.listadetarefascompose.view

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.victor.listadetarefascompose.Graph
import br.com.victor.listadetarefascompose.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListaTarefas(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(backgroundColor = GRAY,
            title = {
                Text(
                    text = "Lista de Tarefas",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = BLACK
                )
            })


    },
        backgroundColor = GRAY,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Graph.SALVAR_TAREFA)

                },
                backgroundColor = MEDIUM_GRAY,

                ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )

            }
        }
    ) {

    }

}

@Preview(showSystemUi = true)
@Composable
fun ListaTarefasPreview() {
    ListaDeTarefasComposeTheme {
        val navController = rememberNavController()
        ListaTarefas(navController = navController)
    }
}