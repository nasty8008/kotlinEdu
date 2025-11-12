package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "nasty8008",
        password = "bebebe",
        email = "nasty8008@mail.ru",
    )

    val user2 = User(
        id = 2,
        login = "ne_nasty8008",
        password = "bububu",
        email = "ne_nasty8008@mail.ru",
    )

    println("""
        Данные пользователя user${user1.id}:
            Логин: ${user1.login}
            Пароль: ${user1.password}
            Почта: ${user1.email}
    """.trimIndent())

    println("""
        Данные пользователя user${user2.id}:
            Логин: ${user2.login}
            Пароль: ${user2.password}
            Почта: ${user2.email}
    """.trimIndent())
}