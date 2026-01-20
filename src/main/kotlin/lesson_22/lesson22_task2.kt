package lesson_22

fun main() {
    val regBook = NewRegularBook("Анна Каренина", "Лев Толстой")
    val dataBook = NewDataBook("Анна Каренина", "Лев Толстой")

    println(regBook) // По умолчанию выводится имя класса и хэш-код объекта + не переопределен метод toString()
    println(dataBook) // Data class автоматически генерирует метод toString()
}

class NewRegularBook(
    val title: String,
    val author: String,
)

data class NewDataBook(
    val title: String,
    val author: String,
)