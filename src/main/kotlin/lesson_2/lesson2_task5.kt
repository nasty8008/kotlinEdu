package org.example.lesson_2

import kotlin.math.pow

const val STARTING_AMOUNT = 70_000

fun main() {
    val interestRate = 16.7
    val durationInYears = 20

    val depositAmount = STARTING_AMOUNT * (1 + interestRate / 100).pow(durationInYears)
    println("Размер вклада через 20 лет: %.3f".format(depositAmount))
}