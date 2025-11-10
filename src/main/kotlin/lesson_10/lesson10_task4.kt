package lesson_10

fun main() {
    var timesUserWon = 0
    timesUserWon += newRound()

    do {
        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln().lowercase()
        if (answer == "да") {
            timesUserWon += newRound()
        } else if (answer == "нет") {
            break
        } else {
            println("Неверный ввод")
            continue
        }
    } while (true)

    println("Вы победили компьютер $timesUserWon раз(а)")
}

fun diceToss(): Int {
    val diceRange = 1..6
    return diceRange.random()
}

fun newRound(): Int {
    var winRoundsCounter = 0
    print("Кости бросает пользователь. Результат:")
    val userScore = diceToss()
    println(userScore)

    print("Кости бросает компьютер. Результат:")
    val computerScore = diceToss()
    println(computerScore)

    if (userScore > computerScore) {
        println("Победило человечество")
        winRoundsCounter++
    } else if (computerScore > userScore) {
        println("Победила машина")
    } else println("Победила дружба")

    return winRoundsCounter
}

