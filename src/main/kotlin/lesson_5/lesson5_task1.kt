package lesson_5

const val RIGHT_ANSWER = 1

fun main() {
    println(
        """
        Здравствуйте!
        
        Докажите, что вы не бот решив этот пример: limₙ→∞ ∫₀¹ n·xⁿ⁻¹ dx
    """.trimIndent()
    )

    print("Введите ответ: ")
    val userAnswer = readln().toInt()

    if (userAnswer == RIGHT_ANSWER) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")
}