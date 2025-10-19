package org.example.lesson_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val departureHours: Int = 9
    val departureMinutes: Int = 39
    val departureTime = departureHours * MINUTES_PER_HOUR + departureMinutes
    val travelTime: Int = 457
    val arrivalTime: Int = departureTime + travelTime

    println("Поезд прибудет в %02d:%02d".format(arrivalTime / MINUTES_PER_HOUR, arrivalTime % MINUTES_PER_HOUR))
}