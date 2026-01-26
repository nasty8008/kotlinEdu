package lesson_22

fun main() {
    val person = Person("nasty8008", 2004, "Female")
    val (name, yearOfBirth, gender) = person
    println("Имя: $name; Год рождения: $yearOfBirth; Пол: $gender")
}

data class Person(
    val name: String,
    val yearOfBirth: Int,
    val gender: String,
)