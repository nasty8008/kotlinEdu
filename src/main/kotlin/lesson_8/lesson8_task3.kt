package lesson_8

fun main() {
    val listOfIngredients = arrayOf(
        "лаваш",
        "филе курицы",
        "помидоры",
        "огурцы",
        "капуста",
        "морковь по-корейски",
        "сыр",
        "томатный соус",
        "чесночный соус",
        "масло растительное",
        "соль",
        "перец"
    )

    println("Какой ингредиент вы ищете?")
    val ingredient = readln()

    if (ingredient in listOfIngredients) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }

    println("Такого ингредиента в рецепте нет")
}