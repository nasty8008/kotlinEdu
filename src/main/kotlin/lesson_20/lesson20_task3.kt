package lesson_20

fun main() {
    val keyCheck = { player: Player -> if (player.hasKey) "«Игрок открыл дверь»" else "«Дверь заперта»" }

    val playerWithKey = Player(true)
    val playerWithoutKey = Player(false)

    println(keyCheck(playerWithKey))
    println(keyCheck(playerWithoutKey))
}

class Player(val hasKey: Boolean)