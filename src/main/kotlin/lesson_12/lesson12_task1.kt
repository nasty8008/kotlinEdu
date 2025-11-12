package lesson_12

class WeatherInfo() {
    var dayTemp = 0
    var nightTemp = 0
    var isPrecipitationCondition = false

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
    val mondayWeather = WeatherInfo().apply {
        dayTemp = 20
        nightTemp = 16
    }
    mondayWeather.getWeather()

    println()

    val tuesdayWeather = WeatherInfo().apply {
        dayTemp = 19
        nightTemp = 14
        isPrecipitationCondition = true
    }
    tuesdayWeather.getWeather()
}