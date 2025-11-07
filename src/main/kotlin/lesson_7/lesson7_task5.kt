package lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val upperCharRange = 'A'..'Z'
    val lowerCharRange = 'a'..'z'
    val digitRange = 0..9

    print("Введите желаемую длину пароля (пароль не может быть короче $MIN_PASSWORD_LENGTH символов): ")
    val passwordLength = readln().toInt()

    if (passwordLength < MIN_PASSWORD_LENGTH) {
        println("Ошибка: пароль должен содержать минимум $MIN_PASSWORD_LENGTH символов")
        return
    }

    var userPassword = ""

    for (i in 0..passwordLength) {
        when ((1..3).random()) {
            1 -> userPassword += upperCharRange.random()
            2 -> userPassword += lowerCharRange.random()
            3 -> userPassword += digitRange.random()
        }
    }

    println("Сгенерированный пароль: $userPassword")
}