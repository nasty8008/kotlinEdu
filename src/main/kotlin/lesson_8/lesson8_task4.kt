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

    println("Список ингредиентов:")
    for (ingredient in listOfIngredients) println("• $ingredient")

    println("\nКакой ингредиент из списка вы хотите заменить?")
    val oldIngredient = readln()

    if (oldIngredient !in listOfIngredients) {
        println("Такого ингредиента нет в списке")
        return
    }

    println("\nНа какой ингредиент вы хотите его заменить?")
    val newIngredient = readln()

    listOfIngredients[listOfIngredients.indexOf(oldIngredient)] = newIngredient
    println("\nГотово! Вы сохранили следующий список: ")
    for (ingredient in listOfIngredients) println("• $ingredient")
}