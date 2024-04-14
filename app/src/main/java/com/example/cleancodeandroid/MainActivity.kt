package com.example.cleancodeandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.example.cleancodeandroid.ui.theme.CleanCodeAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanCodeAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EverythingInOne()
                }
            }
        }
    }
}

@Composable
fun EverythingInOne() {
    val viewModel: MainViewModel = viewModel()
    val list = viewModel.getHotels()
    Column {
        list.forEach { h ->
            Card {
                Column {
                    Image(painter = rememberImagePainter(h.imgUrl), contentDescription = null,
                        modifier = Modifier.sizeIn(maxWidth = 200.dp, maxHeight = 200.dp))
                    Text(h.n)
                    Text(h.loc)
                    Text("${h.r} stars")
                    Button(onClick = { viewModel.book(h.id, 1, "2023-01-01", "2023-01-10") }) {
                        Text("Book Now")
                    }
                }
            }
        }
    }
}
