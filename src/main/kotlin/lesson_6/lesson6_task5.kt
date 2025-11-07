package lesson_6

fun main() {
    val range = 1..9
    var triesLeft = 3

    println("Докажите, что вы не бот.")

    while (triesLeft > 0) {
        val firstNumber = range.random()
        val secondNumber = range.random()
        val rightAnswer = firstNumber + secondNumber

        println("Сколько будет $firstNumber + $secondNumber?")
        print("Введите ответ: ")
        val userAnswer = readln().toInt()

        if (userAnswer == rightAnswer) {
            println("Добро пожаловать!")
            return
        } else {
            triesLeft--
            println("Неверно")
        }
    }
    println("Доступ запрещен")

}