package com.example.cleancodeandroid.repository

import com.example.cleancodeandroid.data.Hotel
import com.example.cleancodeandroid.data.Reservation

class HotelRepository {
    private val sampleHotels = listOf(
        Hotel(1, "Sea View", "Malibu, CA", 4.5, "https://www.udea.edu.co/wps/wcm/connect/udea/99fc43e7-7a64-45bd-97fc-96639b70813d/logosimbolo-vertical.png?MOD=AJPERES&CVID=ljeLvHr"),
    )
    private val reservations = mutableListOf<Reservation>()

    fun getHotels(): List<Hotel> = sampleHotels

    fun addReservation(reservation: Reservation) {
        reservations.add(reservation)
    }
}