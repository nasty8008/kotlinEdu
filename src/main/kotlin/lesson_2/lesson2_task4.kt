package org.example.lesson_2

const val BUFF_PERCENT = 20
const val PERCENT_DIVISOR = 100

fun main() {
    val cristalOre: Int = 7
    val ironOre: Int = 11

    val buffForCristal = cristalOre * BUFF_PERCENT / PERCENT_DIVISOR
    val buffForIron = ironOre * BUFF_PERCENT / PERCENT_DIVISOR

    println("Бонус для кристаллической руды: $buffForCristal")
    println("Бонус для железной руды: $buffForIron")
}