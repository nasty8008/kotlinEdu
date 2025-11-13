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
    fun addUser(_name: String, _status: String = "пользователь заглушен") {
        if (userList.any { user ->  user.name == _name}) {
            println("Такой пользователь уже есть")
            return
        }
        val newUser = User(name = _name, status = _status)
        userList.add(newUser)
    }

    fun updateUserStatus(userName: String, newStatus: String) {
        userList.forEach {
            if (it.name == userName) it.status = newStatus
        }
    }
}

fun main() {
    val statusOptions = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val testRoom = Room(
        roomName = "test room",
    )

    testRoom.addUser("nasty8008", statusOptions[1])
    testRoom.addUser("ne_nasty8008")
    testRoom.userList.forEach { user ->
        println("${user.name}: ${user.status}")
    }

    testRoom.updateUserStatus(userName = "ne_nasty8008", newStatus = statusOptions[0])
    testRoom.userList.forEach { user ->
        println("${user.name}: ${user.status}")
    }
}