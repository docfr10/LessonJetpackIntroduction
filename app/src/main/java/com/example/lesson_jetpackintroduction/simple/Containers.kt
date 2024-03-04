package com.example.lesson_jetpackintroduction.simple

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Containers() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.End
    ) {
        val text1 = remember { mutableStateOf("") }

        OutlinedTextField(value = text1.value, onValueChange = { text1.value = it })

        Text(text = "Text 1", modifier = Modifier.background(Color.Red))
        Text(text = "Text 2", modifier = Modifier.background(Color.Green))
        Text(text = "Text 3", modifier = Modifier.background(Color.Blue))
    }

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
    ) {
        var text1 by remember { mutableStateOf("") }

        OutlinedTextField(value = text1, onValueChange = { text1 = it })

        Text(text = "Text 1", modifier = Modifier.background(Color.Red))
        Text(text = "Text 2", modifier = Modifier.background(Color.Green))
        Text(text = "Text 3", modifier = Modifier.background(Color.Yellow))
    }
}