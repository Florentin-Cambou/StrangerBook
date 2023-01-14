package com.wiapp.strangerbook.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.wiapp.strangerbook.data.allPosts

@Composable
fun LazyListTile(){
    LazyColumn(){
        items(allPosts()){
            post -> (ListTile(post = post))
        }
    }
}