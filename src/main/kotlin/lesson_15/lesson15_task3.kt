package lesson_15

abstract class User(val userName: String) {
    abstract val role: String

    fun readMessage(id: Int) {
        println("$userName прочитал сообщение с ID: $id")
    }

    fun writeMessage(message: String) {
        println("$userName написал сообщение: $message")
    }
}

class ForumUser(userName: String) : User(userName) {
    override val role: String = "user"
}

class ForumAdmin(userName: String) : User(userName) {
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
        writeMessage("Привет!")
        readMessage(1)
    }

    ForumAdmin("ne_nasty8008").apply {
        readMessage(1)
        deleteMessage(1)
        deleteUser("nasty8008")
    }
}