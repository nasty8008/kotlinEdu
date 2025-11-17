package lesson_13

class PhoneBookRecord(
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
    val phoneBook = mutableListOf<PhoneBookRecord>()

    while (true) {
        print("Введите имя: ")
        val contactName = readln()

        print("Введите номер телефона: ")
        val contactPhone = readln().toLongOrNull()

        if (contactPhone == null) {
            println("Вы не ввели номер телефона, эта запись не добавится в книгу")
            continue
        }

        print("Введите компанию: ")
        var contactCompany: String? = readln()
        if (contactCompany == "") contactCompany = null

        phoneBook.add(
            PhoneBookRecord(
                name = contactName,
                phone = contactPhone,
                company = contactCompany
            )
        )

        println("Хотите добавить ещё одну запись?")
        if (readln().equals("нет", ignoreCase = true)) {
            break
        }
    }

    phoneBook.forEach {
        println()
        it.printContactInfo()
    }
}

