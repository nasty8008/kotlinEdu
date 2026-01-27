package lesson_22

fun main() {
    val event = GalacticGuide(
        "Alpha Centauri",
        description = "Ближайшая к Солнцу звездная система, состоящая из трех звезд: Ригиль Кентаврус, Толиман и Проксима Центавра.",
        dateAndTime = "21 января 2026 года 18:00 UTC",
        distance = 4.37,
    )

    println("--- Путеводитель для путешествующих автостопом по Галактике ---")
    println("Место или событие: ${event.component1()}")
    println("Описание: ${event.component2()}")
    println("Дата и время события: ${event.component3()}")
    println("Дистанция: ${event.component4()} световых лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateAndTime: String,
    val distance: Double,
)