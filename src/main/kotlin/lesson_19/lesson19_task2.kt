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
    CLOTHES {
        override fun getCategoryName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getCategoryName(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun getCategoryName(): String {
            return "Разное"
        }
    };

    abstract fun getCategoryName(): String
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

