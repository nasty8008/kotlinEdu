package lesson_3

const val DAY_GREETING = "Добрый день"
const val EVENING_GREETING = "Добрый вечер"

fun main() {
    val userName = "Анастасия"
    var greetMessage: String

    greetMessage = "$DAY_GREETING, $userName!"
    println(greetMessage)

    greetMessage = "$EVENING_GREETING, $userName!"
    println(greetMessage)
}