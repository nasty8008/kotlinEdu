package lesson_21

fun main() {
    val numbers = listOf(1, 2, 5, 4, 8, 42, 12, 3, 57)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (number in this) {
        if (number % 2 == 0) sum += number
    }
    return sum
}