package lesson_19

fun main() {
    val product1 = Product(name = "Футболка", id = 1, category = Category.CLOTHES)
    val product2 = Product(name = "Блокнот", id = 2, category = Category.STATIONERY)
    val product3 = Product(name = "Крючок для вязания", id = 3, category = Category.OTHER)

    product1.printProductInfo()
    product2.printProductInfo()
    product3.printProductInfo()
}

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            else -> "Разное"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printProductInfo() {
        println("ID товара: $id\nНазвание товара: $name\nКатегория товара: ${category.getCategoryName()}")
        println("----------------------------------------------")
    }
}