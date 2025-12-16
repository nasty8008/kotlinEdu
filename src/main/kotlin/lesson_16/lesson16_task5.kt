package lesson_16

class Player(
    name: String,
) {
    private var health = 30
    private var power = 5

    fun getHit(damage: Int) {
        print("Игрок получил $damage урона. ")
        if (health - damage <= 0) {
            death()
            return
        }
        health -= damage
        println("Уровень здоровья: $health ОЗ")
    }

    fun heal(points: Int) {
        println("Игрок восстановил $points ОЗ")
        health += points
    }

    private fun death() {
        println("Игрок умер.")
        power = 0
        health = 0
    }
}

fun main() {
    val player1 = Player("nasty800")
    player1.apply {
        getHit(5)
        getHit(10)
        heal(5)
        getHit(5)
        getHit(10)
        heal(10)
        getHit(100)
    }
}