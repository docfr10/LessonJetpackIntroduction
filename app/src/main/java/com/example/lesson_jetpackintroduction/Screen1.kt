package com.example.lesson_jetpackintroduction

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Screen1(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Screen 1")

        Button(onClick = { navController.navigate("Screen_2") }) {
            Text(text = "Go to Screen 2")
        }
    }
}