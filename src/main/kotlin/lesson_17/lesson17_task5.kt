package lesson_17

private class User(
    private val _login: String,
    private val _password: String,
) {
    var login = _login
        set(value) {
            println("Вы успешно изменили логин $field на $value")
            field = value
        }

    var password = _password
        get() = List(field.length) {"*"}.joinToString("")
        set(value) = println("Вы не можете изменить пароль.")
}

fun main() {
    val testUser = User(_login = "nasty8008", _password = "bebebe")
    testUser.password = "bububububu"
    println(testUser.password)
    println(testUser.login)
    testUser.login = "ne_nasty8008"
    println(testUser.login)
}