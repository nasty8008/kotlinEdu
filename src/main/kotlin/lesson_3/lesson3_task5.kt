package org.example.lesson_3

fun main() {
    val stepInfo = "D2-D4;0"

    val stepInfoParsed = stepInfo.split("-", ";")

    val stepFrom = stepInfoParsed[0]
    val stepTo = stepInfoParsed[1]
    val stepNumber = stepInfoParsed[2]

    println("Откуда: $stepFrom")
    println("Куда: $stepTo")
    println("Номер хода: $stepNumber")
}