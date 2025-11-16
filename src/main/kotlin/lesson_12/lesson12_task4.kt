package lesson_12

const val CELSIUS_KELVIN_DIFF = 273.15

class WeatherInformationData(
    val dayTemp: Int,
    val nightTemp: Int,
    val isPrecipitationCondition: Boolean,
) {
    init {
        println(
            """
                Температура днём: ${"%.1f".format(dayTemp - CELSIUS_KELVIN_DIFF)}°С
                Температура ночью: ${"%.1f".format(nightTemp - CELSIUS_KELVIN_DIFF)}°С
                Вероятность осадков: $isPrecipitationCondition
            """.trimIndent()
        )
    }
}

fun main() {
    WeatherInformationData(
        dayTemp = 257,
        nightTemp = 251,
        isPrecipitationCondition = true
    )
}