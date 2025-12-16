package lesson_16

private const val PI = 3.14

class Circle(private val radius: Int) {
    fun findLength() = println("Длина окружности с радиусом $radius равна ${2 * PI * radius}")
    fun findArea() = println("Площадь круга с радиусом $radius равна ${PI * radius * radius}")
}

fun main() {
    Circle(4).apply {
        findLength()
        findArea()
    }
}