package lesson_5

import kotlin.math.pow

const val CM_IN_M = 100

fun main() {

    print("Введите вес(кг): ")
    val weight = readln().toFloat()

    print("Введите рост(см): ")
    val height = readln().toFloat()

    val bmi = weight / (height / CM_IN_M).pow(2)

    val category = when {
        bmi < 18.5 -> "недостаточная масса тела"
        bmi < 25 -> "нормальная масса тела"
        bmi < 30 -> "избыточная масса тела"
        else -> "ожирение"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("У вас $category.")

}