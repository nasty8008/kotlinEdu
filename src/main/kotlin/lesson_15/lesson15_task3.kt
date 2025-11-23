package lesson_15

abstract class User {
    abstract val userName: String
    abstract val role: String

    fun readMessages(id: Int) {
        println("$userName прочитал сообщение с ID: $id")
    }

    fun writeMessages(message: String) {
        println("$userName написал сообщение: $message")
    }
}

class ForumUser(override val userName: String) : User() {
    override val role: String = "user"
}

class ForumAdmin(override val userName: String) : User() {
    override val role: String = "admin"

    fun deleteUser(user: String) {
        println("$userName удалил пользователя $user")
    }

    fun deleteMessage(id: Int) {
        println("$userName удалил сообщение с ID: $id")
    }
}

fun main() {
    ForumUser("nasty8008").apply {
        writeMessages("Привет!")
        readMessages(1)
    }

    ForumAdmin("ne_nasty8008").apply {
        readMessages(1)
        deleteMessage(1)
        deleteUser("nasty8008")
    }
}