package lesson_12

const val CELSIUS_KELVIN_OFFSET = 273.15

class WeatherData(kelvinDayTemp: Int, kelvinNightTemp: Int, _isPrecipitationCondition: Boolean = false) {
    var dayTemp = kelvinDayTemp - CELSIUS_KELVIN_OFFSET
    var nightTemp = kelvinNightTemp - CELSIUS_KELVIN_OFFSET
    var isPrecipitationCondition = _isPrecipitationCondition

    fun getWeather() {
        println(
            """
                Температура днём: ${"%.1f".format(dayTemp)}°С
                Температура ночью: ${"%.1f".format(nightTemp)}°С
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