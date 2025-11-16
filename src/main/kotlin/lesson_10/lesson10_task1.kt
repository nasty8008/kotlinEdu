package lesson_10

fun main() {
    print("Кости бросает пользователь. Результат:")
    val userScore = diceTossing()
    println(userScore)

    print("Кости бросает компьютер. Результат:")
    val computerScore = diceTossing()
    println(computerScore)

    if (userScore > computerScore) {
        println("Победило человечество")
    } else if (computerScore > userScore) {
        println("Победила машина")
    } else println("Победила дружба")
}

fun diceTossing(): Int {
    val diceRange = 1..6
    return diceRange.random()
}