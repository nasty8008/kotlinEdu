package lesson_10

fun main() {
    print("Введите желаемую длину пароля: ")
    val passwordLength = readln().toInt()
    println("Ваш пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword(length: Int): String {
    val digits = (0..9)
    val specialSymbols = (' '..'/')
    var password = ""
    for (i in 0 until length) {
        password += if (i % 2 == 0) {
            digits.random()
        } else specialSymbols.random()
    }
    return password
}