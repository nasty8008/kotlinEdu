package lesson_20

fun main() {
    val listOfPhrases =
        mutableListOf<String>("Привет!", "Я робот", "Я умею разговаривать", "Как тебя зовут?", "Приятно познакомиться!")
    val number = listOfPhrases.indices.random()

    fun say(phraseNumber: Int) {
        println(listOfPhrases[phraseNumber])
    }

    fun setModifier(phraseNumber: Int, modifier: (Int) -> Unit) {
        return modifier(phraseNumber)
    }
    say(number)
    setModifier(number) { phraseNumber: Int ->
        listOfPhrases[phraseNumber] = listOfPhrases[phraseNumber].reversed()
    }
    say(number)
}