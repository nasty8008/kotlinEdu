package lesson_10

fun main() {
    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    checkAuthLength(userLogin, userPassword)
}

fun checkAuthLength(login: String, password: String) {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать, $login!")
}