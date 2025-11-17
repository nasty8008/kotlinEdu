package lesson_14

abstract class SpaceBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val moons: List<Moon>,
) : SpaceBody(name, hasAtmosphere, isLandable) {
    fun printPlanetInfo() {
        println("Планета $name имеет следующие спутники:")
        moons.forEach {
            println("• ${it.name}")
        }
    }
}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : SpaceBody(name, hasAtmosphere, isLandable)

fun main() {
    Planet(
        name = "Марс",
        hasAtmosphere = false,
        isLandable = true,
        moons = listOf(
            Moon(name = "Фобос", hasAtmosphere = true, isLandable = true),
            Moon(name = "Деймос", hasAtmosphere = false, isLandable = false)
        ),
    ).printPlanetInfo()
}