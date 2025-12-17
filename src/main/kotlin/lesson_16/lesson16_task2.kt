package lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun findLength() = 2 * PI * radius
    fun findArea() = PI * radius.pow(2)
}

fun main() {
    val circle = Circle(4.0)
    println("Длина окружности: ${circle.findLength()}")
    println("Площадь круга: ${circle.findArea()}")
}