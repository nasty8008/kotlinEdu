package lesson_18

import kotlin.math.pow


open class Box {
    open fun getArea(): Double = 0.0
}

class CubeBox(
    val edgeLength: Double
) : Box() {
    override fun getArea() = 6 * edgeLength.pow(2)
}

class RectBox(
    val width: Double,
    val length: Double,
    val height: Double,
) : Box() {
    override fun getArea() = 2 * (width * height + width * length + length * height)
}


fun main() {
    val box1 = CubeBox(2.0)
    val box2 = RectBox(2.0, 10.0, 10.0)

    println("Площадь поверхности квадратной коробки равна ${box1.getArea()}")
    println("Площадь поверхности прямоугольной коробки равна ${box2.getArea()}")
}