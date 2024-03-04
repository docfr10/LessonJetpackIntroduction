package com.example.lesson_jetpackintroduction.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Screen3(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Screen 3")

        Button(onClick = { navController.navigate("Screen_1") }) {
            Text(text = "Go to Screen 1")
        }

        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Back")
        }
    }
}