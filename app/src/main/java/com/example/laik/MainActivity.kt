package com.example.laik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laik.screen.PeinadoEditar
import com.example.laik.screen.PeinadoListScreen
import com.example.laik.widget.BottomBar
import com.example.laik.widget.PeinadoCard
import com.example.laik.ui.theme.LaikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaikTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Scaffold(
                        bottomBar = { BottomBar() }
                    ) { paddingValiues ->
                        PeinadoListScreen(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    0.dp,
                                    0.dp,
                                    0.dp,
                                    paddingValiues.calculateBottomPadding() / 2
                                )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Scaffold(
        bottomBar = { BottomBar() }
    ) { paddingValiues ->
        PeinadoCard(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 0.dp, 0.dp, paddingValiues.calculateBottomPadding() / 2)
        )
    }
}