package com.example.cleancodeandroid.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.cleancodeandroid.viewmodel.HotelViewModel

@Composable
fun HotelList(viewModel: HotelViewModel) {
    val hotels = viewModel.hotels
    LazyColumn {
        items(hotels) { hotel ->
            HotelItem(hotel, onHotelClick = { viewModel.makeReservation(hotel.id) })
        }
    }
}