package lesson_8

fun main() {
    val viewsPerDayOfWeek = arrayOf(32, 12, 34, 23, 67, 80, 54)
    var viewsPerWeek = 0

    for (i in viewsPerDayOfWeek) {
        viewsPerWeek += i
    }

    println("За это неделю рекламу посмотрели $viewsPerWeek раз(а)")
}