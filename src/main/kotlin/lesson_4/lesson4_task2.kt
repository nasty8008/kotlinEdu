package lesson_4

const val AVG_WEIGHT_LOW = 35
const val AVG_WEIGHT_HIGH = 100
const val AVG_VOLUME_HIGH = 100

fun main() {
    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${weight > AVG_WEIGHT_LOW && weight <= AVG_WEIGHT_HIGH && volume < AVG_VOLUME_HIGH}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
            "${weight > AVG_WEIGHT_LOW && weight <= AVG_WEIGHT_HIGH && volume < AVG_VOLUME_HIGH}")
}