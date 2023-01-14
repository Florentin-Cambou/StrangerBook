package com.wiapp.strangerbook.composables

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun ScaffoldComposable(){
    Scaffold(
        topBar = { TopAppBarComposable() },
        content = { BodyComposable() }
    )
}