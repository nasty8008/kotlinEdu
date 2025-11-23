package lesson_15

interface Flying {
    fun fly() {
        println("умеет летать")
    }
}

interface Swimming {
    fun swim() {
        println("умеет плавать")
    }
}

class Carp : Swimming {
    override fun swim() {
        print("Карп ")
        super.swim()
    }
}

class Seagull : Flying {
    override fun fly() {
        print("Чайка ")
        super.fly()
    }
}

class Duck : Swimming, Flying {
    override fun swim() {
        print("Утка ")
        super.swim()
    }

    override fun fly() {
        print("Утка ")
        super.fly()
    }
}

fun main() {
    Carp().swim()
    Seagull().fly()
    Duck().swim()
    Duck().fly()
}