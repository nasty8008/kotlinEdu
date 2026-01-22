package lesson_19

fun main() {
    Tank().apply {
        switchAmmo(2, AmmoType.BLUE)
        shoot()
        shoot()
        switchAmmo(1, AmmoType.RED)
        shoot()
        shoot()
        switchAmmo(1, AmmoType.GREEN)
        shoot()
    }
}

enum class AmmoType(val damage: Int, val desc: String) {
    BLUE(5, "синие"),
    GREEN(10, "зеленые"),
    RED(20, "красные"),
}

class Tank {
    var ammoCount: Int = 0
    var currentAmmoType: AmmoType? = null

    fun switchAmmo(amount: Int, type: AmmoType) {
        println("Вы подобрали ${type.desc} патроны x${amount}")
        ammoCount = amount
        currentAmmoType = type
    }

    fun shoot() {
        if (ammoCount > 0) {
            ammoCount -= 1
            println("Вы выстрелили и нанесли урон в размере ${currentAmmoType?.damage} ОУ")
        } else println("Патронов нет!")
    }
}