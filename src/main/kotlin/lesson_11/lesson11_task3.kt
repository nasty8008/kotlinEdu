package lesson_11

class User(
    var userName: String,
    val profilePic: String? = null,
    var status: String,
)

class Room(
    val roomName: String,
    val roomPic: String? = null,
    var userList: MutableList<User> = mutableListOf(),
) {
    fun addUser(user: User) {
        userList.add(user)
    }

    fun updateUserStatus(user: User, status: String) {
        val userIndex = userList.indexOf(user)
        userList[userIndex].status = status
    }
}

fun main() {
    val statusOptions = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val user1 = User(
        userName = "nasty8008",
        status = statusOptions[1],
    )

    val user2 = User(
        userName = "ne_nasty8008",
        status = statusOptions[2],
    )

    val testRoom = Room(
        roomName = "test room",
    )

    testRoom.addUser(user1)
    testRoom.addUser(user2)
    testRoom.userList.forEach { user ->
        println("${user.userName}: ${user.status}")
    }

    testRoom.updateUserStatus(user = user2, status = statusOptions[0])
    testRoom.userList.forEach { user ->
        println("${user.userName}: ${user.status}")
    }
}