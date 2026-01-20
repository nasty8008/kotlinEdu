package lesson_21

fun main() {
    val playerStats = mapOf("Ум" to 4, "Харизма" to 6, "Выносливость" to 5, "Ловкость" to 6)
    println(playerStats.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    val max = this.maxOf {it.value}
    return this.entries.find { it.value == max }?.key
}