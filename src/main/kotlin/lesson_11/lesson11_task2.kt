package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun getUserInfo() {
        println(
            """
        Данные пользователя user$id:
            Логин: $login
            Пароль: $password
            Почта: $email
            О себе: ${bio ?: "Нет данных"}
    """.trimIndent()
        )
    }

    fun writeBio() {
        println("Напишите о себе:")
        bio = readln()
    }

    fun changePassword() {
        print("Введите старый пароль: ")
        if (readln() == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль был успешно изменён!")
        } else println("Неверный пароль")
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "nasty8008",
        password = "bebebe",
        email = "nasty8008@mail.ru",
    )

    user.getUserInfo()
    user.changePassword()
    user.writeBio()
    user.getUserInfo()
}