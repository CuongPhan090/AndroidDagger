package com.example.b32dagger.data

data class Car(
    var title: String,
    var engine: Engine,
    var color: Color
)

data class Engine(
    var model: String,
    var horsePower: Double,
    val engineColor: Color
)

data class Color(
    var red: String,
    var green: String,
    var blue: String
)