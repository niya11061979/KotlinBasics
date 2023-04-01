package com.example.myapplication.lesson1

fun main() {
    print("введите количество секунд ,которые Гагарин провел в космосе :")
    val secondsOfFlight = readLine()?.toIntOrNull() ?: return
    val minAndSec = secondsToMinutes(secondsOfFlight)

    println("Время проведенное в космос(мм:сс) $minAndSec")
    if (minAndSec == "108:00") {
        println("Отлично вы хорошо знаете историю")
    } else {
        println("Вам нужно подтянуть знания , Ю.Гагарина провел в космосе 108 мин 00 секунд")
    }
}

fun secondsToMinutes(secondsOfFlight: Int): String {
    val min = secondsOfFlight / 60
    val sec = secondsOfFlight % 60
    val minStr = if (min < 10) "0$min" else min
    val secStr = if (sec < 10) "0$sec" else sec

    return "$minStr:$secStr"
}



