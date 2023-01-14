package com.wiapp.strangerbook.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TopAppBarComposable(){
    TopAppBar() {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "StrangerBook")
        }
    }
}