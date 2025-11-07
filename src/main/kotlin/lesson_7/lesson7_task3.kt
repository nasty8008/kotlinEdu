package lesson_7

fun main() {
    print("Введите число: ")
    val lastNumber = readln().toInt()

    for (i in 0..lastNumber step 2) println(i)
}