package lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val amountOfIngredients = readln().toInt()
    val listOfIngredients = Array(amountOfIngredients) { "" }

    println("Введите все ингредиенты, каждый с новой строки:")
    for (i in 0 until amountOfIngredients) {
        print("${i + 1}. ")
        val ingredient = readln()
        listOfIngredients[i] = ingredient
    }

    println("Список ингредиентов: ${listOfIngredients.joinToString()}")
}