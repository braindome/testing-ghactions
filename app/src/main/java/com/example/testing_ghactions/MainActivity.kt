package com.example.testing_ghactions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testing_ghactions.ui.theme.TestingghactionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    var buttonLabel by remember { mutableStateOf("Click me!") }
    var counter by remember { mutableIntStateOf(0) }
    TestingghactionsTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello, Testing GH Actions!", modifier = Modifier.padding(16.dp))
            Button(onClick = { buttonLabel = "Clicked" }) {
                Text(text = buttonLabel)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Counter")
            Row {
                Button(onClick = { counter++ }) {
                    Text(text = "Increase")
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { counter-- }) {
                    Text(text = "Decrease")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "$counter")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}