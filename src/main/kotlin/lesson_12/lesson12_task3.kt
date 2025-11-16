package lesson_12

const val CELSIUS_KELVIN_OFFSET = 273.15

class WeatherData(kelvinDayTemp: Int, kelvinNightTemp: Int, _isPrecipitationCondition: Boolean = false) {
    val dayTemp = (kelvinDayTemp - CELSIUS_KELVIN_OFFSET).toInt()
    val nightTemp = (kelvinNightTemp - CELSIUS_KELVIN_OFFSET).toInt()
    val isPrecipitationCondition = _isPrecipitationCondition

    fun getWeather() {
        println(
            """
                Температура днём: $dayTemp°С
                Температура ночью: $nightTemp°С
                Вероятность осадков: $isPrecipitationCondition
            """.trimIndent()
        )
    }
}

fun main() {
    WeatherData(
        kelvinDayTemp = 257,
        kelvinNightTemp = 251,
        _isPrecipitationCondition = true
    ).getWeather()
}