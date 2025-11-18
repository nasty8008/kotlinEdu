package lesson_14

class Chat(
    val name: String,
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(_authorId: Int, _text: String) {
        messages.add(
            Message(
                id = messages.size,
                authorId = _authorId,
                text = _text,
            )
        )
    }

    fun addThreadMessage(_authorId: Int, _text: String, _parentMessageId: Int) {
        messages.add(
            ChildMessage(
                id = messages.size,
                authorId = _authorId,
                text = _text,
                parentMessageId = _parentMessageId,
            )
        )
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            if (message is ChildMessage) message.parentMessageId else message.id
        }

        messages.filter { it !is ChildMessage }.forEach { parentMessage ->
            println(parentMessage.text)

            groupedMessages[parentMessage.id]?.forEach { childMessage ->
                if (childMessage is ChildMessage) {
                    println(" | ${childMessage.text}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val authorId: Int,
    val text: String,
)

class ChildMessage(
    id: Int,
    authorId: Int,
    text: String,
    val parentMessageId: Int,
) : Message(id, authorId, text)

fun main() {
    Chat(name = "Пацаны сосиски в тесте").apply {
        addMessage(0, "\uD835\uDD7D\uD835\uDD9A\uD835\uDD91\uD835\uDD8A\uD835\uDD98")
        addThreadMessage(
            _authorId = 1, _text = "1. Не спамить!", _parentMessageId = 0
        )
        addMessage(1, "@all гг я пошел спать всем спокойной ночи!")
        addThreadMessage(
            _authorId = 0, _text = "2. Не тегать всех участников сервера!!!", _parentMessageId = 0
        )
        addThreadMessage(
            _authorId = 1, _text = "::peepoBed", _parentMessageId = 2
        )
        printChat()
    }
}