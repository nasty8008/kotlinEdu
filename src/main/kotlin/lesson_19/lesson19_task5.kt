package lesson_19

fun main() {
    val listOfPeople = mutableListOf<Person>()
    println(
        "Сначала введите ваше имя, начиная его с заглавной буквы." + "\nДалее введите ваш пол: «М» или «Ж»."
    )
    repeat(5) {
        addPerson(listOfPeople)
    }
    listOfPeople.forEach { person ->
        println("Имя пользователя: ${person.name}. Пол пользователя: ${person.gender.desc}")
    }
}

enum class Gender(val desc: String) {
    MALE("М"), FEMALE("Ж"),
}

class Person(
    val name: String,
    val gender: Gender,
)

fun addPerson(list: MutableList<Person>) {
    print("Имя: ")
    val personName = readln()
    print("Пол: ")
    val personGender = readln()
    val personGenderType: Gender = when (personGender) {
        Gender.FEMALE.desc -> Gender.FEMALE
        Gender.MALE.desc -> Gender.MALE
        else -> {
            println("Неверное значение пола. Прекращение создания карточки пользователя.")
            println("-------------------------------------------------------------------")
            return
        }
    }
    list.add(Person(personName, personGenderType))
    println("-------------------------------------------------------------------")
}