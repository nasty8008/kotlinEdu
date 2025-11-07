package lesson_6

fun main() {
    val winNumber = (1..9).random()
    var triesLeft = 5

    while (triesLeft > 0) {
        triesLeft--
        println("Угадайте число от 1 до 9:")
        val guessNumber = readln().toInt()
        if (guessNumber == winNumber) {
            println("Это была великолепная игра!")
            triesLeft = 0
        }
        else println("Неверно")
    }

    println("Было загадано число $winNumber")
}