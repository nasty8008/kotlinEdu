package lesson_12

class WeatherInformation(
    val dayTemp: Int,
    val nightTemp: Int,
    val isPrecipitationCondition: Boolean,
) {
    fun getWeather() {
        println(
            """
            Температура днём: $dayTemp
            Температура ночью: $nightTemp
            Вероятность осадков: $isPrecipitationCondition
        """.trimIndent()
        )
    }
}

fun main() {
    val todayWeather = WeatherInformation(
        dayTemp = 20,
        nightTemp = 16,
        isPrecipitationCondition = true
    )

    todayWeather.getWeather()
}