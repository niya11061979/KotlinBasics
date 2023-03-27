package com.example.myapplication

fun main() {
    val yearFlight: Int = 1961
    var hourFlightOfLanding: Int = 9
    var minFlightOfLanding: Int = 7
    println("Первый пилотируемый полет Ю.Гагарин в космос совершил в $yearFlight году")
    println("Старт корабля в $hourFlightOfLanding часов")
    println("Старт корабля в $minFlightOfLanding минут")
    hourFlightOfLanding = 10
    minFlightOfLanding = 55
    println("Посадку корабль совершил  в $hourFlightOfLanding:$minFlightOfLanding")
}