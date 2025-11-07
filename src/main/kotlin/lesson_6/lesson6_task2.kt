package lesson_6

fun main() {
    println("Введите количество секунд:")
    var counter: Int = readln().toInt()
    val message = "Прошло $counter секунд"

    while (counter > 0) {
        counter--
        Thread.sleep(1000)
    }
    println(message)
}