package com.example.lesson_jetpackintroduction.navigation

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@Composable
fun Screen2(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Screen 2")

        Button(onClick = {
            navController.navigate("Screen_1") {
                popUpTo("Screen_2") { inclusive = true }
            }
        }) {
            Text(text = "Go to Screen 1")
        }

        Button(onClick = { navController.navigate("Screen_3") }) {
            Text(text = "Go to Screen 3")
        }

        val context = LocalContext.current

        BackHandler {
            Toast.makeText(context, "SOME TEXT", Toast.LENGTH_LONG).show()
            navController.popBackStack()
        }
    }
}