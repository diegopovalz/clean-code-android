package com.example.cleancodeandroid.data

data class Reservation(
    val userId: Int,
    val hotelId: Int,
    val checkInDate: String,
    val checkOutDate: String
)