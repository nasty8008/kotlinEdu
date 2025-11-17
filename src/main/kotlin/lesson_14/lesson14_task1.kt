package lesson_14

open class Liner(
    val speed: Double = 30.0,
    val maxCapacity: Int = 100,     // вместительность пассажиров
    val maxPayload: Double = 50.0,    // грузоподъемность или вместительность в тоннах (надеюсь верно поняла из условия, что это одно и то же)
    val canBreakIce: Boolean = false,
) {
    fun printShipInfo() {
        println(
            """
            • Скорость: $speed км/ч
            • Вместительность: $maxCapacity пассажиров
            • Грузоподъёмность: $maxPayload т
            • Может колоть лёд: $canBreakIce
        """.trimIndent()
        )
    }
}

class CargoShip() : Liner(speed = 25.0, maxCapacity = 20, maxPayload = 500.0)

class Icebreaker() : Liner(speed = 20.0, maxCapacity = 15, maxPayload = 40.0, canBreakIce = true)

fun main() {
    println("Лайнер:")
    Liner().printShipInfo()

    println("Грузовой:")
    CargoShip().printShipInfo()

    println("Ледокол:")
    Icebreaker().printShipInfo()
}