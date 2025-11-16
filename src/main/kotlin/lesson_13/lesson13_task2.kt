package lesson_13

class Contact(
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

fun main() {
    Contact(
        name = "Анастасия",
        phone = 89998914371,
    ).printContactInfo()
}