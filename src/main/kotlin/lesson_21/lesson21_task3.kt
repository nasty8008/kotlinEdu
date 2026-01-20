package lesson_21

fun main() {
    val player1 = NewPlayer("nasty8008", 20, 12)
    val player2 = NewPlayer("ne_nasty8008", 20, 20)

    println(player1.isHealthy())
    println(player2.isHealthy())
}

class NewPlayer(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
)

fun NewPlayer.isHealthy(): Boolean {
    return currentHealth == maxHealth
}