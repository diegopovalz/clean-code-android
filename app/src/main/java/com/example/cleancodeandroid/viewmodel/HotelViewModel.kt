package com.example.cleancodeandroid.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.cleancodeandroid.data.Hotel
import com.example.cleancodeandroid.data.Reservation
import com.example.cleancodeandroid.repository.HotelRepository

class HotelViewModel : ViewModel() {
    private val hotelRepository = HotelRepository()

    val hotels = mutableStateListOf<Hotel>()

    init {
        hotels.addAll(hotelRepository.getHotels())
    }

    fun makeReservation(id: Int) {
        val reservation = createSampleReservation(id)
        hotelRepository.addReservation(reservation)
    }

    private fun createSampleReservation(hotelId: Int): Reservation {
        val defaultUserId = 1
        val defaultCheckInDate = "2024-01-01"
        val defaultCheckOutDate = "2024-01-10"

        return Reservation(
            userId = defaultUserId,
            hotelId = hotelId,
            checkInDate = defaultCheckInDate,
            checkOutDate = defaultCheckOutDate
        )
    }

}