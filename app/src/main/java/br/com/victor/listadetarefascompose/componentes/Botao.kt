package br.com.victor.listadetarefascompose.componentes

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.victor.listadetarefascompose.ui.theme.BLACK
import br.com.victor.listadetarefascompose.ui.theme.LIGHT_GRAY
import br.com.victor.listadetarefascompose.ui.theme.MEDIUM_GRAY

@Composable
fun Botao(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    text: String = "",
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = LIGHT_GRAY,
            contentColor = BLACK
        )
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

    }

}