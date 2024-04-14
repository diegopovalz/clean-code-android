package com.example.cleancodeandroid

data class Hotel(val id: Int, val n: String, val loc: String, val r: Double, val imgUrl: String)
data class Reservation(val uid: Int, val hid: Int, val cid: String, val cod: String)
