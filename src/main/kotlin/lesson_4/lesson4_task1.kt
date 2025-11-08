package lesson_4

const val ALL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedTablesToday < ALL_TABLES}\nДоступность столиков на завтра: ${reservedTablesTomorrow < ALL_TABLES}")
}
