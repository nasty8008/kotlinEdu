package lesson_6

fun main() {
    println("Введите новый логин:")
    val newLogin = readln()

    println("Введите новый пароль:")
    val newPassword = readln()

    println("\nПодтвердите авторизацию")

    do {
        println("Введите логин:")
        val userLogin = readln()
        println("Введите пароль:")
        val userPassword = readln()

        if (userLogin != newLogin || userPassword != newPassword)
            println("Неверный логин или пароль. Введите данные заново.")

    } while (userLogin != newLogin || userPassword != newPassword)

    println("Авторизация прошла успешно!")
}