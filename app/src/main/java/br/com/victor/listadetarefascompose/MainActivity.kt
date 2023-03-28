package br.com.victor.listadetarefascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.victor.listadetarefascompose.ui.theme.ListaDeTarefasComposeTheme
import br.com.victor.listadetarefascompose.view.ListaTarefas
import br.com.victor.listadetarefascompose.view.SalvarTarefas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefasComposeTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Graph.LISTA_TAREFAS
                ){
                    composable(route = Graph.LISTA_TAREFAS){
                        ListaTarefas(navController = navController)
                    }
                    composable(route = Graph.SALVAR_TAREFA ){
                        SalvarTarefas(navController = navController)
                    }
                }

            }
        }
    }
}

object Graph{
    const val LISTA_TAREFAS = "listaTarefas"
    const val SALVAR_TAREFA = "salvarTarefa"
}

