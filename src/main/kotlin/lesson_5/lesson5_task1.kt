package lesson_5

fun main() {

    val number1 = (0..10).random()
    val number2 = (0..10).random()

    val rightAnswer = number1 + number2

    println(
        """
        Здравствуйте!
        
        Докажите, что вы не бот решив этот пример: $number1 + $number2}
    """.trimIndent()
    )

    print("Введите ответ: ")
    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")
}