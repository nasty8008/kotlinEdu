package lesson_14

open class LinerShip(
    val speed: Double = 30.0,
    val maxCapacity: Int = 100,     // вместительность пассажиров
    val maxPayload: Double = 50.0,  // грузоподъемность или вместительность в тоннах (надеюсь верно поняла из условия, что это одно и то же)
    val canBreakIce: Boolean = false,
) {
    fun printShipInfo() {
        println(
            """
            • Скорость: ${speed} км/ч
            • Вместительность: ${maxCapacity} пассажиров
            • Грузоподъёмность: ${maxPayload} т
            • Может колоть лёд: $canBreakIce
        """.trimIndent()
        )
    }

    open fun embark() {
        println("Погрузка на лайнер началась: выдвигаем горизонтальный трап со шкафута")
    }
}

class Cargoship() : LinerShip(speed = 25.0, maxCapacity = 20, maxPayload = 500.0) {
    override fun embark() {
        println("Погрузка на грозовое судно началась: активируем погрузочный кран")
    }
}

class IcebreakerShip() : LinerShip(speed = 20.0, maxCapacity = 15, maxPayload = 40.0, canBreakIce = true) {
    override fun embark() {
        println("Погрузка на ледокол началась: открываем ворота со стороны кормы")
    }
}

fun main() {
    println("Лайнер:")
    LinerShip().apply {
        printShipInfo()
        embark()
    }

    println("Грузовой:")
    Cargoship().apply {
        printShipInfo()
        embark()
    }

    println("Ледокол:")
    IcebreakerShip().apply {
        printShipInfo()
        embark()
    }
}