package com.example.myapplication

fun main() {
    val numberOrders: Long = 75
    val thanksMessage: String = "Спасибо за покупку.Мы всегда с Вами!"
    var quantityWorkers:Int=2000
    println("number of orders=$numberOrders,   thanks message=$thanksMessage ")
    //println("quantity of workers=$quantityWorkers")
    quantityWorkers -= 1
    println("quantity of workers=$quantityWorkers")
}