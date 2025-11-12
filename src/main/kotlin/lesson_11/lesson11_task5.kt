package lesson_11

// Пока мало знакома с паттернами. При написании кода отталкивалась от этой статьи: https://dev.to/asvid/kotlin-builder-pattern-284a,
// но у меня не до конца сформировалось понимание самого паттерна Builder
class Forum private constructor(
    val listOfForumUsers: List<ForumUser>,
    val messages: List<Message>,
) {
    class Builder {
        val listOfForumUsers: MutableList<ForumUser> = mutableListOf()
        val messages: MutableList<Message> = mutableListOf()

        fun createNewUser(userName: String): ForumUser? {
            if (listOfForumUsers.any { it.name == userName }) {
                println("Имя $userName уже занято")
                return null
            }

            val newForumUser = ForumUser(
                id = listOfForumUsers.size,
                name = userName,
            )
            listOfForumUsers.add(newForumUser)
            return newForumUser
        }

        fun createNewMessage(userId: Int, message: String): Message? {
            if (listOfForumUsers.none { it.id == userId }) {
                println("Пользователь с ID $userId не найден")
                return null
            }

            val newMessage = Message(
                authorId = userId,
                message = message,
            )
            messages.add(newMessage)
            return newMessage
        }

        fun build(): Forum {
            return Forum(listOfForumUsers, messages)
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val author = listOfForumUsers.find { it.id == message.authorId }
            println("${author?.name ?: "Неизвестный"}: ${message.message}")
        }
    }
}

class ForumUser(
    val id: Int,
    val name: String,
)

class Message(
    val authorId: Int,
    val message: String,
)

fun main() {
    val builder = Forum.Builder()

    builder.createNewUser("nasty8008")
    builder.createNewUser("ne_nasty8008")

    builder.createNewMessage(userId = 0, message = "Привет!")
    builder.createNewMessage(userId = 1, message = "И тебе привет :)")
    builder.createNewMessage(userId = 0, message = "Что это за форум?")
    builder.createNewMessage(userId = 1, message = "Это проверочный форум для Kotlin Sprint")

    val forum = builder.build()
    forum.printThread()
}