package lesson_22

fun main() {
    val regBook1 = RegularBook("Анна Каренина", "Дев Толстой")
    val regBook2 = RegularBook("Анна Каренина", "Дев Толстой")

    val dataBook1 = DataBook("Анна Каренина", "Дев Толстой")
    val dataBook2 = DataBook("Анна Каренина", "Дев Толстой")

    println(regBook1 == regBook2) // false, так как в этом случае сравниваются ссылки на объекты в памяти
    println(dataBook1 == dataBook2) // true, потому что у Data класса сравниваются проинициализированные данные, а не ссылки на объекты
}

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)