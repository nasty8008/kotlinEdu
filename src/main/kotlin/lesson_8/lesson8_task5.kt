package lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val amountOfIngredients = readln().toInt()
    val ingredients = Array(amountOfIngredients) { "" }

    println("Введите все ингредиенты, каждый с новой строки:")
    for (i in ingredients.indices) {
        print("${i + 1}. ")
        ingredients[i] = readln()
    }

    println("Список ингредиентов: ${ingredients.joinToString()}")
}