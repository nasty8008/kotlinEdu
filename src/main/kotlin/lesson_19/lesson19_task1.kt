package lesson_19

enum class Fish(val title: String, val id: Int) {
    GUPPY("гуппи", 1),
    ANGELFISH("скалярия", 2),
    GOLDFISH("золотая рыбка", 3),
    SIAM_FIGHT_FISH("петушок", 4),
}

fun main() {
    val listOfFishId = listOf(1, 2, 3, 4)

    println("Вот каких рыбок вы можете добавить в свой аквариум:")
    for (i in listOfFishId) when (i) {
        Fish.GUPPY.id -> println("- " + Fish.GUPPY.title)
        Fish.ANGELFISH.id -> println("- " + Fish.ANGELFISH.title)
        Fish.GOLDFISH.id -> println("- " + Fish.GOLDFISH.title)
        Fish.SIAM_FIGHT_FISH.id -> println("- " + Fish.SIAM_FIGHT_FISH.title)
    }
}