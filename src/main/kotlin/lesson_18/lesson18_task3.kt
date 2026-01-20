package lesson_18

open class Animal(
    val name: String
) {
    open fun eat() = println("$name -> ест")
}

class Fox(name: String) : Animal(name) {
    override fun eat() = println("$name -> ест ягоды")
}

class Dog(name: String) : Animal(name) {
    override fun eat() = println("$name -> ест кости")
}

class Cat(name: String) : Animal(name) {
    override fun eat() = println("$name -> ест рыбу")
}

fun main() {
    val dog = Dog("Тоша")
    val cat = Cat("Буся")
    val fox = Fox("Фенечка")

    val animals = listOf<Animal>(dog, cat, fox)
    for (animal in animals) {
        animal.eat()
    }
}