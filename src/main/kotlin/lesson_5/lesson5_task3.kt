package lesson_5

const val WIN_FIRST_NUMBER = 13
const val WIN_SECOND_NUMBER = 27

fun main() {

    print("Введите первое число: ")
    val firstNumber = readln().toInt()
    print("Введите второе число: ")
    val secondNumber = readln().toInt()

    val result = if ((firstNumber == WIN_FIRST_NUMBER || firstNumber == WIN_SECOND_NUMBER) &&
        (secondNumber == WIN_FIRST_NUMBER || secondNumber == WIN_SECOND_NUMBER)) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (firstNumber == WIN_FIRST_NUMBER || firstNumber == WIN_SECOND_NUMBER ||
        secondNumber == WIN_FIRST_NUMBER || secondNumber == WIN_SECOND_NUMBER) {
        "Вы выиграли утешительный приз!"
    } else "Неудача!"

    println(result)
    println("Выйгрышные числа: $WIN_FIRST_NUMBER и $WIN_SECOND_NUMBER")
}