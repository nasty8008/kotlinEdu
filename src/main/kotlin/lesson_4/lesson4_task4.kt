package lesson_4

fun main() {

    val daysCounter: Int = 5

    val isArmsAndAbs = daysCounter % 2 == 1

    println("""
        Упражнения для рук:    ${isArmsAndAbs}
        Упражнения для ног:    ${!isArmsAndAbs}
        Упражнения для спины:  ${!isArmsAndAbs}
        Упражнения для пресса: ${isArmsAndAbs} 
    """.trimIndent())
}