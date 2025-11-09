package lesson_9

fun main() {
    print("Введите 5 ингредиентов в одну строчку через запятую: ")
    val ingredients = readln().split(", ")
    println(ingredients.sorted())
}