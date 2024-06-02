package com.example.lab6_kotlin.model.entities


    data class Seat(val row: Char,
                    val number: Int,
                    var status: SeatStatus)