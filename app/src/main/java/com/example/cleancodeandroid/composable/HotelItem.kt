package com.example.cleancodeandroid.composable

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.cleancodeandroid.data.Hotel

@Composable
fun HotelItem(hotel: Hotel, onHotelClick: () -> Unit) {
    Log.d("HOTELITEM", hotel.imageUrl)
    Card(modifier = Modifier
        .padding(8.dp)
    ) {
        Column {
            Image(painter = rememberImagePainter(hotel.imageUrl), contentDescription = "Hotel Image",
                modifier = Modifier.sizeIn(maxWidth = 200.dp, maxHeight = 200.dp))
            Text(hotel.name, style = MaterialTheme.typography.headlineSmall)
            Text(hotel.location)
            Text("${hotel.rating} stars")
            Button(onClick = { onHotelClick() }) {
                Text("Book Now")
            }
        }
    }
}