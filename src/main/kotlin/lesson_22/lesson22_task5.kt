package lesson_22

fun main() {
    val event = GalacticGuide(
        "Alpha Centauri",
        description = "Ближайшая к Солнцу звездная система, состоящая из трех звезд: Ригиль Кентаврус, Толиман и Проксима Центавра.",
        dateAndTime = "21 января 2026 года 18:00 UTC",
        distance = 4.37,
    )

    val (name, desc, time, dist) = event

    println("--- Путеводитель для путешествующих автостопом по Галактике ---")
    println("Место или событие: $name")
    println("Описание: $desc")
    println("Дата и время события: $time")
    println("Дистанция: $dist световых лет")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateAndTime: String,
    val distance: Double,
)