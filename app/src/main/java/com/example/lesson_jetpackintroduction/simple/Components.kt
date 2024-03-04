package com.example.lesson_jetpackintroduction.simple

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lesson_jetpackintroduction.R

@Composable
fun Components() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .shadow(200.dp)
            .border(10.dp, Color.Black)
    ) {
        Text(text = "Test_1", modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .clickable {
                Log.i("INFO", "Click")
            }
            .shadow(200.dp)
        )
    }

    Button(
        onClick = { Log.i("INFO", "Button") },
        modifier = Modifier.padding(all = 20.dp)
    ) {
        Text(text = "Click me")
    }

    var text = "123"
    TextField(value = text, onValueChange = { text = it })

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "123") },
        modifier = Modifier.padding(vertical = 10.dp)
    )

    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Icon",
        modifier = Modifier
            .fillMaxHeight()
            .size(200.dp)
            .clip(RoundedCornerShape(200.dp))
            .background(Color.Blue)
    )
}