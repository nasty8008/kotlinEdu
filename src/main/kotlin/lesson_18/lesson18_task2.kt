package lesson_18

open class Dice() {
    open fun throwDice() = println()
}

class FourSideDice() : Dice() {
    override fun throwDice() {
        println("На четырехгранной кости выпало значение: ${(1..4).random()}")
    }
}

class SixSideDice() : Dice() {
    override fun throwDice() {
        println("На шестигранной кости выпало значение: ${(1..6).random()}")
    }
}

class EightSideDice() : Dice() {
    override fun throwDice() {
        println("На восьмигранной кости выпало значение: ${(1..8).random()}")
    }
}

fun main() {
    val dice4 = FourSideDice()
    val dice6 = SixSideDice()
    val dice8 = EightSideDice()

    val dices = listOf<Dice>(dice4, dice6, dice8)
    dices.forEach {
        it.throwDice()
    }
}