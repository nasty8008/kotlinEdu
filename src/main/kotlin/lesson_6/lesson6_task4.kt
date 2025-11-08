package lesson_6

fun main() {
    val winNumber = (1..9).random()
    var triesLeft = 5

    do {
        println("Угадайте число от 1 до 9:")
        val guessNumber = readln().toInt()
        if (guessNumber == winNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            --triesLeft
            println("Неверно. Осталось попыток: $triesLeft")
        }
    } while (triesLeft > 0)

    println("Было загадано число $winNumber")
}