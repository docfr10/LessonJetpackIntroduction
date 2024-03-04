package com.example.lesson_jetpackintroduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.lesson_jetpackintroduction.ui.theme.LessonJetpackIntroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LessonJetpackIntroductionTheme {
                // AppNavHost()
                // ScaffoldFun()
                // LazyRowFun()
                // LazyColumnFun()
            }
        }
    }
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Graph_1"
    ) {
        navigation(startDestination = "Screen_2", route = "Graph_1") {
            composable(route = "Screen_1") {
                Screen1(navController = navController)
            }
            composable(route = "Screen_2") {
                Screen2(navController = navController)
            }
        }

        navigation(startDestination = "Screen_3", route = "Graph_2") {
            composable(route = "Screen_3") {
                Screen3(navController = navController)
            }
        }
    }
}