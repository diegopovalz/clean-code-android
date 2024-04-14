package com.example.cleancodeandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cleancodeandroid.composable.HotelList
import com.example.cleancodeandroid.ui.theme.CleanCodeAndroidTheme
import com.example.cleancodeandroid.viewmodel.HotelViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val hotelViewModel by viewModels<HotelViewModel>()

        setContent {
            CleanCodeAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HotelList(hotelViewModel)
                }
            }
        }
    }
}

