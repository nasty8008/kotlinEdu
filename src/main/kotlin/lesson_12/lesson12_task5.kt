package lesson_12

import kotlin.random.Random

const val DAYS_PER_MONTH = 30

class WeatherInfoData(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitationCondition: Boolean,
)

fun main() {
    val monthWeather = mutableListOf<WeatherInfoData>()
    val dayTemperatureRange = 15..30
    val nightTemperatureRange = 5..20

    repeat(DAYS_PER_MONTH) {
        monthWeather.add(
            WeatherInfoData(
                dayTemperature = dayTemperatureRange.random(),
                nightTemperature = nightTemperatureRange.random(),
                isPrecipitationCondition = Random.nextBoolean()
            )
        )
    }


    val dayTemperatures = monthWeather.map { it.dayTemperature }
    val nightTemperatures = monthWeather.map { it.nightTemperature }

    val averageDayTemp = dayTemperatures.average()
    val averageNightTemp = nightTemperatures.average()

    val daysWithPrecipitation = monthWeather.count { it.isPrecipitationCondition }

    println("Средняя дневная температура: ${"%.1f".format(averageDayTemp)}°C")
    println("Средняя ночная температура: ${"%.1f".format(averageNightTemp)}°C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}