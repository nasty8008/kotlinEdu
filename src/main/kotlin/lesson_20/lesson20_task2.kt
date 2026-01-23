package lesson_20

const val HEAL_POINTS = 5

fun main() {
    val heal = { player: Player ->
        if (player.currentHealth + HEAL_POINTS > player.maxHealth) {
            player.currentHealth = player.maxHealth
        } else player.currentHealth += HEAL_POINTS
        println("Игрок ${player.name} восстановил $HEAL_POINTS ОЗ. Текущее здоровье: ${player.currentHealth}")
    }

    val player1 = Player("nasty8008", 20, 14)
    heal(player1)
    heal.invoke(player1)
}

class Player(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
)