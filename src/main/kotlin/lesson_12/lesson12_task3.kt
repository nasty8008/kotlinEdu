package lesson_12

class WeatherData {
    var dayTemp = 0
    var nightTemp = 0
    var isPrecipitationCondition = false

    fun getWeather() {
        println(
            """
                Температура днём: ${"%.1f".format(dayTemp - 237.15)}°С
                Температура ночью: ${"%.1f".format(nightTemp - 237.15)}°С
                Вероятность осадков: $isPrecipitationCondition
            """.trimIndent()
        )
    }
}

fun main() {
    WeatherData().apply {
        dayTemp = 257
        nightTemp = 251
        isPrecipitationCondition = true
        getWeather()
    }
}