package org.example.lesson_1

fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    val hours = seconds/3600
    val secondsWithoutHours = seconds % 3600
    val minutes = secondsWithoutHours / 60
    val secondsLeft = secondsWithoutHours % 60

    println("0$hours:$minutes:0$secondsLeft")
}