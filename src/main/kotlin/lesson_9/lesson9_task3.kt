package lesson_9

const val EGGS_PER_PORTION = 2
const val MILK_PER_PORTION = 50
const val BUTTER_PER_PORTION = 15

fun main() {
    val ingredientsForOnePortion = mutableListOf(EGGS_PER_PORTION, MILK_PER_PORTION, BUTTER_PER_PORTION)
    println("Сколько порций вы хотите сделать?")
    val amountOfPortions = readln().toInt()
    val totalIngredients = ingredientsForOnePortion.map { ingredient: Int ->
        ingredient * amountOfPortions
    }
    println(
        "На $amountOfPortions порций вам понадобится: " +
                "Яиц — ${totalIngredients[0]}, " +
                "молока — ${totalIngredients[1]}, " +
                "сливочного масла — ${totalIngredients[2]}"
    )
}