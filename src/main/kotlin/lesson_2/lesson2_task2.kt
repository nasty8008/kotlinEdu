package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30

    val employeeSalary = 30000
    val internSalary = 20000

    val expensesForEmployees = numberOfEmployees * employeeSalary
    val expensesForInterns = numberOfInterns * internSalary

    val allExpenses = expensesForInterns + expensesForEmployees
    val avgSalary = allExpenses / (numberOfInterns + numberOfEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesForEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $allExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $avgSalary")
}