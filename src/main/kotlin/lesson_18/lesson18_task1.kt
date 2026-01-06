package lesson_18

class Order(
    val number: Int
) {
    fun getOrderInfo(
        orderItem: String
    ) {
        println("Заказан товар: $orderItem")
    }

    fun getOrderInfo(
        orderItem: List<String>
    ) {
        println("Заказаны следующие товары: ${orderItem.joinToString()}")
    }
}

fun main() {
    val order1 = Order(1)
    val order1Item = "dog toy"
    val order2 = Order(2)
    val order2Items = listOf("hairbrush", "ribbons", "blush")

    order1.getOrderInfo(order1Item)
    order2.getOrderInfo(order2Items)
}