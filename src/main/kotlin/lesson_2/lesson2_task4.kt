package org.example.lesson_2

const val BUFF_PERCENT = 20

fun main() {
    val cristalOre: Int = 7
    val ironOre: Int = 11

    val buffForCristal = cristalOre * BUFF_PERCENT / 100
    val buffForIron = ironOre * BUFF_PERCENT / 100

    println("Бонус для кристаллической руды: $buffForCristal")
    println("Бонус для железной руды: $buffForIron")
}