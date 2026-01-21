package lesson_18

open class Dice() {
    open val diceSize: Int = 0
    open fun throwDice() = println("На кости выпало значение: ${(1..diceSize).random()}")
}

class FourSideDice() : Dice() {
    override val diceSize: Int = 4
}

class SixSideDice() : Dice() {
    override val diceSize: Int = 6
}

class EightSideDice() : Dice() {
    override val diceSize: Int = 8
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