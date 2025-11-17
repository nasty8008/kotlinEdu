package lesson_14

import kotlin.math.*

abstract class Figure(
    val color: String,
) {
    abstract fun findArea(): Double
    abstract fun findPerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun findArea(): Double {
        val area = PI * radius.pow(2)
        return area
    }

    override fun findPerimeter(): Double {
        val perimeter = 2 * PI * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double,
) : Figure(color) {
    override fun findArea(): Double {
        val area = height * width
        return area
    }

    override fun findPerimeter(): Double {
        val perimeter = 2 * (height + width)
        return perimeter
    }
}

fun main() {
    val figuresList = listOf(
        Circle(color = "черный", radius = 2.0),
        Circle(color = "белый", radius = 9.5),
        Rectangle(color = "черный", height = 4.0, width = 6.0),
        Rectangle(color = "белый", height = 10.0, width = 3.0)
    )

    var blackPerimeterSum = 0.0

    figuresList.filter { it.color == "черный" }.forEach {
        blackPerimeterSum += it.findPerimeter()
    }
    println("Сумма периметров всех черных фигур: ${"%.2f".format(blackPerimeterSum)}")

    var whiteAreaSum = 0.0

    figuresList.filter { it.color == "белый" }.forEach {
        whiteAreaSum += it.findArea()
    }
    println("Сумма площадей всех белых фигур: ${"%.2f".format(whiteAreaSum)}")
}