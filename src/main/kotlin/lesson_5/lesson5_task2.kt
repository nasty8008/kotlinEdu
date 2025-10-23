package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2025
    val yearOfBirth = readln().toInt()
    val userAge = currentYear - yearOfBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else {
        "Back to main screen"
    }

    println(resultText)

}