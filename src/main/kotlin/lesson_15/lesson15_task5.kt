package lesson_15

interface Movable {
    fun move()
}

interface TransportPassengers {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengers: Int) {
        currentPassengers = (currentPassengers + passengers).coerceAtMost(maxPassengers)
        println("В машину посадили $currentPassengers пассажира")
    }

    fun unloadPassengers(passengers: Int) {
        if (passengers > currentPassengers) {
            println("Ошибка: не могут выйти $passengers пассажиров! В машине только: $currentPassengers")
            return
        }
        currentPassengers -= passengers
        println("Из машины вышли $passengers пассажиров")
    }
}

interface TransportCargo {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo(cargo: Int) {
        currentCargo = (currentCargo + cargo).coerceAtMost(maxCargo)
        println("В машину загрузили $currentCargo т груза")
    }

    fun unloadCargo(cargo: Int) {
        if (cargo > currentCargo) {
            println("Ошибка: нельзя выгрузить $cargo т груза! В грузовике только: $currentCargo т")
            return
        }
        currentCargo -= cargo
        println("Из грузовика выгрузили $cargo т груза")
    }
}

class Car : Movable, TransportPassengers {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun move() {
        println("Легковая машина едет с $currentPassengers пассажирами")
    }
}

class Truck : Movable, TransportPassengers, TransportCargo {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0
    override val maxCargo: Int = 2
    override var currentCargo: Int = 0

    override fun move() {
        println("Грузовик едет с $currentPassengers пассажиром и $currentCargo тоннами груза")
    }
}

fun main() {
    Car().apply {
        loadPassengers(3)
        move()
        unloadPassengers(3)
        move()
        loadPassengers(2)
        move()
        unloadPassengers(2)
    }

    Truck().apply {
        loadPassengers(1)
        loadCargo(2)
        move()
        unloadCargo(2)
        unloadPassengers(1)
    }
}