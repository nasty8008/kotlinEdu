package lesson_15

interface Movable {
    fun move()
}

interface TransportPassengers {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengers: Int) {
        val newPassengers = currentPassengers + passengers
        val loadedPassengers = newPassengers.coerceAtMost(maxPassengers) - currentPassengers
        currentPassengers = newPassengers.coerceAtMost(maxPassengers)
        println("В машину посадили $loadedPassengers пассажира")
    }

    fun unloadPassengers(passengers: Int) {
        currentPassengers = (currentPassengers - passengers).coerceAtLeast(0)
        println("Из машины вышли $passengers пассажиров")
    }
}

interface TransportCargo {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo(cargo: Int) {
        val newCargo = currentCargo + cargo
        val loadedCargo = newCargo.coerceAtMost(maxCargo) - currentCargo
        currentCargo = newCargo.coerceAtMost(maxCargo)
        println("В машину загрузили $loadedCargo т груза")
    }

    fun unloadCargo(cargo: Int) {
        currentCargo = (currentCargo - cargo).coerceAtLeast(0)
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