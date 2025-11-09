package lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    val listOfIngredients = mutableSetOf<String>()

    println("Введите $NUMBER_OF_INGREDIENTS ингредиентов, каждый с новой строки:")
    for (i in 1..NUMBER_OF_INGREDIENTS) {
        print("$i. ")
        listOfIngredients.add(readln())
    }
    println(listOfIngredients.sorted().joinToString().replaceFirstChar { it.uppercase() })
}