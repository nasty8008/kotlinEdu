package lesson_4

// Благоприятные условия
const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val BEST_AIR_HUMIDITY = 20
const val WORST_SEASON = "зима"

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weather == WEATHER_IS_SUNNY && tent == TENT_IS_OPEN &&
               airHumidity == BEST_AIR_HUMIDITY && season != WORST_SEASON}")
}
