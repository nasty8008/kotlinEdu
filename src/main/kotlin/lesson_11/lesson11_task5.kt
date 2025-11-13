package lesson_11

class Forum(
    val listOfForumUsers: MutableList<ForumUser> = mutableListOf(),
    val messages: MutableList<Message> = mutableListOf(),
) {
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
    val forum = Forum()

    forum.createNewUser("nasty8008")
    forum.createNewUser("ne_nasty8008")

    forum.createNewMessage(userId = 0, message = "Привет!")
    forum.createNewMessage(userId = 1, message = "И тебе привет :)")
    forum.createNewMessage(userId = 0, message = "Что это за форум?")
    forum.createNewMessage(userId = 1, message = "Это проверочный форум для Kotlin Sprint")

    forum.printThread()
}