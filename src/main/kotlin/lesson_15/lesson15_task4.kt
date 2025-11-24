package lesson_15

abstract class Product(
    val name: String,
    val amount: Int,
)

interface Search {
    fun startSearch(partName: String) {
        println("Выполняется поиск комплектующей: $partName")
    }
}

class Instrument(
    name: String,
    amount: Int,
) : Product(name, amount), Search

class InstrumentPart(
    name: String,
    amount: Int,
) : Product(name, amount)

fun main() {
    val instrument = Instrument("Гитара", 50)
    instrument.startSearch("Струны")
}