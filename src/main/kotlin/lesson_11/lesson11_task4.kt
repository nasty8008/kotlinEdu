package lesson_11

class Category(
    val name: String,
    var recipes: MutableList<Recipe> = mutableListOf(),
)

class Recipe(
    val category: Category,
    val name: String,
    var ingredients: MutableList<Ingredient> = mutableListOf(),
    var amountOfPortions: Int = 1,
    val description: String,
    var isFavourite: Boolean = false,
) {
    fun addToFavourites() {
        isFavourite = true
    }

    fun changePortions(newAmount: Int) {
        amountOfPortions = newAmount
        ingredients.forEach { ingredient ->
            ingredient.amount *= newAmount
        }
    }
}

class Ingredient(
    val name: String,
    var amount: Int,
    val unit: String,
)