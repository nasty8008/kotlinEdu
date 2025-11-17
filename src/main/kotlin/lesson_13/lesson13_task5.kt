package lesson_13

fun main() {
    print("Введите номер телефона: ")
    try {
        val phone = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName}")
    }
}

