package lesson_6

fun main() {
    println("Введите количество секунд:")
    var counter: Int = readln().toInt()

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}