package lesson_16

class Dice {
    private val number = (1..6).random()

    fun getNumber() = println(number)
}

fun main() {
    Dice().getNumber()
}