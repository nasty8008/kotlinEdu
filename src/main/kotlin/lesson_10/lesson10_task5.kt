package lesson_10

const val USER_LOGIN = "nasty8008"
const val USER_PASSWORD = "bebebe"
const val TOKEN_LENGTH = 32

fun main() {
    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    val userToken = authorizeUser(userLogin, userPassword)
    getCart(userToken)
}

fun generateToken(length: Int): String {
    val upperCharRange = 'A'..'Z'
    val lowerCharRange = 'a'..'z'
    val digitRange = 0..9

    var token = ""
    for (i in 0 until length) {
        when ((1..3).random()) {
            1 -> token += upperCharRange.random()
            2 -> token += lowerCharRange.random()
            3 -> token += digitRange.random()
        }
    }
    return token
}

fun authorizeUser(login: String, password: String): String? {
    var token: String? = null
    if (USER_LOGIN == login && USER_PASSWORD == password) {
        token = generateToken(TOKEN_LENGTH)
    } else println("Неверный логин или пароль")
    return token
}

fun getCart(token: String?) {
    val shoppingCart = listOf("молоко", "яйца", "хлеб", "пряники")
    if (token == null) {
        println("Авторизация завершилась неуспешно!")
    } else {
        println("Ваша корзина:")
        shoppingCart.forEach { item: String ->
            println("• $item")
        }
    }
}