package lesson_12

class WeatherInformationData(
    val dayTemp: Int,
    val nightTemp: Int,
    val isPrecipitationCondition: Boolean,
) {
    init {
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
    WeatherInformationData(
        dayTemp = 257,
        nightTemp = 251,
        isPrecipitationCondition = true
    )
}