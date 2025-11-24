package lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Carp : Swimming {
    override fun swim() {
        println("Карп умеет плавать")
    }
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка умеет летать")
    }
}

class Duck : Swimming, Flying {
    override fun swim() {
        println("Утка умеет плавать")
    }

    override fun fly() {
        println("Утка умеет летать")
    }
}

fun main() {
    Carp().swim()
    Seagull().fly()
    Duck().swim()
    Duck().fly()
}