package lesson_5

fun main() {
    val range = 0..42
    val winNumbers = List(3) { range.random() }

    println("Введите 3 числа, каждый на новой строке:")
    val userNumbers = List(3) { readln().toInt() }

    val checkList = userNumbers.intersect(winNumbers).size

    val result = when (checkList) {
        3 -> "Вы угадали все числа! Джек-пот!!!"
        2 -> "Вы угадали 2 числа! Вы выиграли крупный приз!"
        1 -> "Вы угадали только одно число. Вы получаете утешительный приз!"
        else -> "Вы не угадали ни одного числа :("
    }

    println(result)
    println("Выигрышные числа: ${winNumbers.joinToString()}")
}