package lesson_19

enum class Fish(val title: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAM_FIGHT_FISH("петушок"),
}

fun main() {
    println("Вот каких рыбок вы можете добавить в свой аквариум:")
    val listOfFish = Fish.entries
    listOfFish.forEach {
        println("- " + it.title)
    }
}