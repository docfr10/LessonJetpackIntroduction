package com.example.lesson_jetpackintroduction.lazyscreen

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LazyColumnFun() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        item {
            Text(text = "Some text", modifier = Modifier.clickable {
                Log.i("Some log", "LOG")
            })
        }

        items(count = 100) {
            Text(text = "Hello, World!", modifier = Modifier.clickable {
                Log.i("Some log", "1")
            })
        }

        val list = listOf("1234", "1213", "13134", "12312")

        items(list) { t ->
            Text(text = t, modifier = Modifier.clickable {
                Log.i("Some log", "2")
            })
        }
    }
}