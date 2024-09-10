package com.appperfektion.simpleweatherapp

data class WeatherResponse(
    val name: String,        //city name
    val main: Main,
    val weather: List<Weather>
)

data class Main(
        val temp: Float,
        val humidity: Int
)

data class Weather(
    val description: String
)