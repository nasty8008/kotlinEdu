package lesson_11

class User(
    var name: String,
    val profilePic: String? = null,
    var status: String,
)

class Room(
    val roomName: String,
    val roomPic: String? = null,
    var userList: MutableList<User> = mutableListOf(),
) {
    fun addUser(user: User) {
        if (user !in userList) userList.add(user) else println("Такой пользователь уже есть")
    }

    fun updateUserStatus(userName: String, newStatus: String) {
        userList.forEach {
            if (it.name == userName) it.status = newStatus
        }
    }
}

fun main() {
    val statusOptions = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val user1 = User(
        name = "nasty8008",
        status = statusOptions[1],
    )

    val user2 = User(
        name = "ne_nasty8008",
        status = statusOptions[2],
    )

    val testRoom = Room(
        roomName = "test room",
    )

    testRoom.addUser(user1)
    testRoom.addUser(user2)
    testRoom.userList.forEach { user ->
        println("${user.name}: ${user.status}")
    }

    testRoom.updateUserStatus(userName = "ne_nasty8008", newStatus = statusOptions[0])
    testRoom.userList.forEach { user ->
        println("${user.name}: ${user.status}")
    }
}