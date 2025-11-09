package lesson_9

fun main() {
    val listOfIngredients = listOf(
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

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { ingredient: String ->
        println("• $ingredient")
    }
}