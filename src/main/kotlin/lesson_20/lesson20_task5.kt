package lesson_20

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { phrase ->
        phrase.reversed()
    }
    robot.say()
}

class Robot {
    private var modifier: (String) -> String = { it }
    val listOfPhrases =
        mutableListOf("Привет!", "Я робот", "Я умею разговаривать", "Как тебя зовут?", "Приятно познакомиться!")

    fun say() {
        val phrase = listOfPhrases.random()
        val modifiedPhrase = modifier(phrase)
        println(modifiedPhrase)
    }

    fun setModifier(action: (String) -> String) {
        modifier = action
    }
}