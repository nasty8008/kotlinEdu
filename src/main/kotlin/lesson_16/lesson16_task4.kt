package lesson_16

class Order(val orderNumber: Int) {
    private var status = "Заказ создан"

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun askForStatusChange(newStatus: String) {
        changeStatus(newStatus)
    }
}