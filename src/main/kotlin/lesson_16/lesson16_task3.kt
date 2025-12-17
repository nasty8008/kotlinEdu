package lesson_16

class User(private val login: String, private val password: String) {
    fun checkPassword(guess: String) = guess == password
}

fun main() {
    val user = User(login = "nasty8008", password = "bebebe")
    println(user.checkPassword("bebebe"))
}