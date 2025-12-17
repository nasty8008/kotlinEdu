package lesson_17

class Package(
    private val number: Int,
    private var startLocation: String
) {
    var counter: Int = 0

    var location = startLocation
        set(value) {
            field = value
            counter++
        }
}

fun main() {
    val myPackage = Package(1324, "Москва")
    println(myPackage.counter)
    myPackage.location = "Рязань"
    println(myPackage.counter)
    myPackage.location = "Пенза"
    println(myPackage.counter)
}