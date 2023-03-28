package br.com.victor.listadetarefascompose.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import br.com.victor.listadetarefascompose.ui.theme.BLACK
import br.com.victor.listadetarefascompose.ui.theme.MEDIUM_GRAY
import br.com.victor.listadetarefascompose.ui.theme.Shapes
import br.com.victor.listadetarefascompose.ui.theme.WHITE

@Composable
fun CaixaDeTexto(
    text: String = "",
    onValueChange: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    label: String = "",
    maxLines: Int = 1,
    keyboardType: KeyboardType,
) {
    OutlinedTextField(
        value = text,
        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(text = label)
        },
        maxLines = maxLines,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = BLACK,
            focusedBorderColor = MEDIUM_GRAY,
            focusedLabelColor = MEDIUM_GRAY,
            backgroundColor = WHITE,
            cursorColor = MEDIUM_GRAY
        ),
        shape = Shapes.medium,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )

}

