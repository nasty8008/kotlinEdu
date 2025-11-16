package lesson_13

class TelephoneRecord(
    val name: String,
    val phone: Long,
    val company: String? = null ?: "<не указано>",
)

fun main() {
    val telephoneRecords = listOf(
        TelephoneRecord(name = "Анастасия", phone = 9454676454321),
        TelephoneRecord(name = "nasty8008", phone = 3546987643214, company = "Яндекс"),
        TelephoneRecord(name = "ne_nasty8008", phone = 45679800987564, company = "null"),
        TelephoneRecord(name = "Настя", phone = 234567980875, company = "Авито"),
        TelephoneRecord(name = "Ася", phone = 234567898765)
    )

    println("Список всех компаний, которые есть в телефонной книге:")
    telephoneRecords.forEach {
        println("• ${it.company}")
    }
}

