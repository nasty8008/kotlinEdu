package lesson_7

fun main() {
    while (true) {
        val verificationCode = (1000..9999).random()
        println("Ваш код авторизации: $verificationCode")
        print("Введите код: ")
        val inputCode = readln().toInt()

        if (inputCode == verificationCode) {
            println("Добрый день!")
            return
        } else println("Код введён неверно. Сейчас вам придёт новый код — попробуйте ещё раз.")
    }
}