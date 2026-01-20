package lesson_21

import java.io.File

fun main() {
    val file = File("test.txt")
    file.writeAtStar("Привет!")
    println(file.readText())
}

fun File.writeAtStar(message: String) {
    val currentText = this.readText()
    writeText(message.lowercase() + currentText)
}