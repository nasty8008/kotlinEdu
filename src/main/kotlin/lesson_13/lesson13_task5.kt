package lesson_13

class PhoneBookContact(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {
    fun printContactInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phone\n" +
                    "- Компания: ${company ?: "<не указано>"}"
        )
    }
}

// Не совсем понимаю зачем здесь класс, особенно без логики заполнения телефонной книги.
// Возможно я неправильно поняла задачу

fun main() {
    print("Введите номер телефона: ")
    try {
        val phone = readln().toLong()
    } catch (e: Exception) {
        println(e)
    }
}

