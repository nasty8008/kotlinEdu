package lesson_9

fun main() {
    val listOfIngredients = mutableListOf("яйца", "молоко", "соль")
    println("В рецепте есть базовые ингредиенты:")
    listOfIngredients.forEach { ingredient: String ->
        println("• $ingredient")
    }

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer.equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfIngredients.add(newIngredient)
    } else return

    println("Теперь в рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { ingredient: String ->
        println("• $ingredient")
    }
}