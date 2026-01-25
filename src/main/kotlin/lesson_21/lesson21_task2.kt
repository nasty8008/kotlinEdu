package lesson_21

fun main() {
    val numbers = listOf(1, 2, 5, 4, 8, 42, 12, 3, 57)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}