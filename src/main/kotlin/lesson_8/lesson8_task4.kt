package lesson_8

fun main() {
    val ingredients = arrayOf(
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

    println("Список ингредиентов:")
    for (ingredient in ingredients) println("• $ingredient")

    println("\nКакой ингредиент из списка вы хотите заменить?")
    val oldIngredient = readln()

    val oldIngredientIndex = ingredients.indexOf(oldIngredient)
    if (oldIngredientIndex < 0) {
        println("Такого ингредиента нет в списке")
        return
    }

    println("\nНа какой ингредиент вы хотите его заменить?")
    val newIngredient = readln()

    ingredients[oldIngredientIndex] = newIngredient
    println("\nГотово! Вы сохранили следующий список: ")
    for (ingredient in ingredients) println("• $ingredient")
}