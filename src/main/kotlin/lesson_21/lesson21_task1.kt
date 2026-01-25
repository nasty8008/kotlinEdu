package lesson_21

fun main() {
    val message = "hello and good morning!"
    println(message.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    (this as CharSequence).forEach {
        if (vowels.contains(it)) count += 1
    }
    return count
}