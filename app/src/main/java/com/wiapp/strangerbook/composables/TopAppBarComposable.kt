package com.wiapp.strangerbook.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.wiapp.strangerbook.ui.theme.strangerTypo

@Composable
fun TopAppBarComposable(){
    TopAppBar() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "StrangerBook",
                fontFamily = strangerTypo,
                fontSize = 35.sp
            )
        }
    }
}