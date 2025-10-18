package org.example.lesson_1

const val SECONDS_PER_HOUR = 3600
const val SECONDS_PER_MINUTE = 60

fun main() {
    val totalSeconds: Short = 6480

    val hours = totalSeconds / SECONDS_PER_HOUR
    val secondsWithoutHours = totalSeconds % SECONDS_PER_HOUR
    val minutes = secondsWithoutHours / SECONDS_PER_MINUTE
    val seconds = secondsWithoutHours % SECONDS_PER_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}