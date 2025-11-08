package lesson_7

fun main() {
    print("Введите количество секунд: ")
    val secondsLimit = readln().toInt()
    for (i in secondsLimit downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}