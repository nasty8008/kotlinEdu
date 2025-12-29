package lesson_17

class Ship(_name: String, _speed: Int, _port: String) {
    var name = _name
        set(value) = println("Менять имя корабля запрещено!")
}

fun main() {
    val ship = Ship("Черная Жемчужина", 30, "Тортуга")
    ship.name = "bebebe"
    println(ship.name)
}