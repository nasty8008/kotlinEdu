package lesson_4

import java.io.IO.readln

const val SHIP_IS_INTACT = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_SUPPLY_BOXES = 50
const val NICE_WEATHER = true

fun main() {
    val shipStatus = readln("У корабля нет повреждений? ").toBoolean()
    val crewNumber = readln("Сколько людей в экипаже? ").toInt()
    val supplyBoxesAmount = readln("Сколько ящиков провизии на борту? ").toInt()
    val weather = readln("Погода благоприятна? ").toBoolean()

    val condition1 = shipStatus == SHIP_IS_INTACT &&
            crewNumber in MIN_CREW..MAX_CREW &&
            supplyBoxesAmount > MIN_SUPPLY_BOXES &&
            (weather == NICE_WEATHER || weather !== NICE_WEATHER)

    val condition2 = shipStatus != SHIP_IS_INTACT &&
            crewNumber == MAX_CREW &&
            supplyBoxesAmount >= MIN_SUPPLY_BOXES &&
            weather == NICE_WEATHER

    println("Можно отправляться: ${condition1 ||condition2}")
}