package lesson_7

fun main() {
    val intRange = 0..9
    val charRange = 'a'..'z'
    var password = ""

    for (i in 1..6) {
        password += if (i % 2 == 1) {
            charRange.random()
        } else {
            intRange.random()
        }
    }

    println(password)
}