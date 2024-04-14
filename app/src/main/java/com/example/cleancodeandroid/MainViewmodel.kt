package com.example.cleancodeandroid

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val hotels = mutableListOf<Hotel>()
    private val reservations = mutableListOf<Reservation>()

    init {
        hotels.add(Hotel(1, "Sea View", "Malibu, CA", 4.5, "https://www.udea.edu.co/wps/wcm/connect/udea/99fc43e7-7a64-45bd-97fc-96639b70813d/logosimbolo-vertical.png?MOD=AJPERES&CVID=ljeLvHr"))
    }

    fun addHotel(h: Hotel) {
        hotels.add(h)
    }

    fun book(hid: Int, uid: Int, cid: String, cod: String) {
        val r = Reservation(uid, hid, cid, cod)
        reservations.add(r)
    }

    fun getHotels(): List<Hotel> = hotels
}
