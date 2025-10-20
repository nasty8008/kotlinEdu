package org.example.lesson_3

fun main() {
    var stepFrom = "E2"
    var stepTo = "E4"
    var stepNumber = 1

    println("$stepFrom-$stepTo;$stepNumber")

    stepFrom = "D2"
    stepTo = "D3"
    stepNumber++

    println("$stepFrom-$stepTo;$stepNumber")
}