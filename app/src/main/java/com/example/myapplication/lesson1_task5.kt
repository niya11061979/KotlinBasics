package com.example.myapplication

fun main() {
    print("Введите количество секунд, которые Гагарин провел в космосе:")
    val secondsOfFlight = readLine()?.toIntOrNull() ?: return
    val minAndSec = secondsToMinutes(secondsOfFlight)
    println("Время проведенное в космосе(мм:сс) $minAndSec")
    if (minAndSec == "108:00") {
        println("Отлично, вы хорошо знаете историю!")
    } else {
        println("Вам надо подтянуть знания. Ю.Гагарин провел в космосе 108 мин 00 секунд ")
    }
}

fun secondsToMinutes(secondsOfFlight: Int): String {
    var strMin = ""
    var strSec = ""
    val min = secondsOfFlight / 60
    val sec = secondsOfFlight % 60
    if (min < 10) strMin = "0$min" else strMin = "$min"
    if (sec < 10) strSec = "0$sec" else strSec = "$sec"
    return "$strMin:$strSec"
}