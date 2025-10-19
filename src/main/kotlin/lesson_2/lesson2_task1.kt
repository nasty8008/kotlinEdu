package org.example.lesson_2

const val NUMBER_OF_STUDENTS = 4

fun main() {
    val grade1 = 3.00f
    val grade2 = 4.00f
    val grade3 = 3.00f
    val grade4 = 5.00f

    val avgGrade = (grade1 + grade2 + grade3 + grade4) / NUMBER_OF_STUDENTS
    println(avgGrade)
}