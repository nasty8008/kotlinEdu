package lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    val listOfIngredients = mutableSetOf<String>()

    println("Введите  ингредиентов, каждый с новой строки:")
    for (i in 1..NUMBER_OF_INGREDIENTS) {
        print("$i. ")
        listOfIngredients.add(readln())
    }
    println(listOfIngredients.sorted().joinToString().capitalize())
    /*
    Для функции capitalize() выходит предупреждение fun String.capitalize() is deprecated.
    Нашла на StackOverflow, что это было сделано из-за особенностей некоторых языков:
    https://stackoverflow.com/questions/74143020/kotlin-why-is-function-deprecated.
    (Например: The German letter "ß" formerly existed only in lower case.)
    Я решила оставить её, так как для русского и английского языков она работает без ошибок + выглядит более читаемой,
    нежели альтернатива, которая есть ниже.
    */

    //println(
    //        listOfIngredients.sorted().joinToString()
    //            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() })
}