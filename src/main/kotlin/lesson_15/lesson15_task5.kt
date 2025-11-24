package lesson_15

interface Movable {
    fun move()
}

interface TransportPassengers {
    val maxPassengers: Int
    var currentPassengers: Int
    fun loadPassengers(passengers: Int)
    fun unloadPassengers(passengers: Int)
}

interface TransportCargo {
    val maxCargo: Double
    var currentCargo: Double
    fun loadCargo(cargo: Double)
    fun unloadCargo(cargo: Double)
}

class Car : Movable, TransportPassengers {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun loadPassengers(passengers: Int) {
        if (passengers > maxPassengers) {
            println("Нельзя посадить $passengers пассажира в легковую машину! Максимум: $maxPassengers")
            return
        }
        if (currentPassengers + passengers > maxPassengers) {
            println("Не хватает мест! Сейчас: $currentPassengers, хотят посадить: $passengers")
            return
        }
        currentPassengers += passengers
        println("В легковую машину посадили $passengers пассажира")
    }

    override fun unloadPassengers(passengers: Int) {
        if (passengers > currentPassengers) {
            println("Ошибка: не могут выйти $passengers пассажиров! В машине только: $currentPassengers")
            return
        }
        currentPassengers -= passengers
        println("Из легковой машины вышли $passengers пассажиров")
    }

    override fun move() {
        println("Легковая машина едет с $currentPassengers пассажирами")
    }
}

class Truck: Movable, TransportPassengers, TransportCargo {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0
    override val maxCargo: Double = 2.0
    override var currentCargo: Double = 0.0

    override fun move() {
        println("Грузовик едет с $currentPassengers пассажиром и $currentCargo тоннами груза")
    }

    override fun loadPassengers(passengers: Int) {
        if (passengers > maxPassengers) {
            println("Нельзя посадить $passengers пассажиров в грузовик! Максимум: $maxPassengers")
            return
        }
        if (currentPassengers + passengers > maxPassengers) {
            println("Не хватает мест! Сейчас: $currentPassengers, хотят посадить: $passengers")
            return
        }
        currentPassengers += passengers
        println("В грузовик посадили $passengers пассажира")
    }

    override fun unloadPassengers(passengers: Int) {
        if (passengers > currentPassengers) {
            println("Ошибка: не могут выйти $passengers пассажиров! В грузовике только: $currentPassengers")
            return
        }
        currentPassengers -= passengers
        println("Из грузовика вышли $passengers пассажиров")
    }

    override fun loadCargo(cargo: Double) {
        if (cargo > maxCargo) {
            println("Нельзя загрузить $cargo т в грузовик! Максимум: $maxCargo т")
            return
        }
        if (currentCargo + cargo > maxCargo) {
            println("Недостаточно места! Сейчас в грузовике $currentCargo т груза, хотят загрузить: $cargo т")
            return
        }
        currentCargo += cargo
        println("В грузовик загрузили $cargo т груза")
    }

    override fun unloadCargo(cargo: Double) {
        if (cargo > currentCargo) {
            println("Ошибка: нельзя выгрузить $cargo т груза! В грузовике только: $currentCargo т")
            return
        }
        currentCargo -= cargo
        println("Из грузовика выгрузили $cargo т груза")
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
        loadCargo(2.0)
        move()
        unloadCargo(2.0)
        unloadPassengers(1)
    }
}