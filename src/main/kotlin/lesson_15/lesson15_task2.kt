package lesson_15

abstract class WeatherStationStats {
    abstract val value: Double
    abstract val unit: String
}

class Temperature(override val value: Double) : WeatherStationStats() {
    override val unit: String = "°C"
}

class PrecipitationAmount(override val value: Double) : WeatherStationStats() {
    override val unit: String = "мм"
}

class WeatherServer {
    fun sendStats(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> println("Данные о температуре: ${stats.value} ${stats.unit}")
            is PrecipitationAmount -> println("Данные об осадках: ${stats.value} ${stats.unit}")
            else -> println("Неизвестный тип данных")
        }
    }
}

fun main() {
    WeatherServer().sendStats(Temperature(20.0))
    WeatherServer().sendStats(PrecipitationAmount(10.3))
}