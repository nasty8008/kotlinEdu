package org.example.lesson_2

const val BUFF = 0.2f

fun main() {
    val cristalOre: Int = 7
    val ironOre: Int = 11

    val buffForCristal = cristalOre * BUFF
    val buffForIron = ironOre * BUFF

    println("Бонус для кристаллической руды: %.0f".format(buffForCristal))
    println("Бонус для железной руды: %.0f".format(buffForIron))
}