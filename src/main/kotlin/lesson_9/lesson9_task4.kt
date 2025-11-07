package lesson_9

fun main() {
    print("Введите 5 ингредиентов в одну строчку через запятую: ")
    val ingredients = readln()
    val listOfIngredients = ingredients.split(", ")
    println(listOfIngredients.sorted())
}