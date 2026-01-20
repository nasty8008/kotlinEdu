package lesson_20

fun main() {
    val listOfElements = listOf<String>("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5", "Элемент 6")
    val lambdaListOfElements = listOfElements.map { element -> { println("Нажат элемент $element") } }

    lambdaListOfElements.forEachIndexed { index, lambda ->
        if ((index + 1) % 2 == 0) {
            lambda()
        }
    }
}