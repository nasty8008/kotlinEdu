package lesson_16

class User {
    private val password = "bebebe"
    val login = "nasty8008"

    fun checkPassword(guess: String) = guess == password
}

fun main() {
    val user = User()
    println(user.checkPassword("bebebe"))
}