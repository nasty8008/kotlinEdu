package lesson_22

fun main() {
    val test = MainScreenViewModel()
    test.loadData()
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

class MainScreenViewModel(
    var mainScreenState: MainScreenState = MainScreenState()
) {
    fun loadData() {
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "Какие-то данные", isLoading = false)
        println(mainScreenState)
    }
}