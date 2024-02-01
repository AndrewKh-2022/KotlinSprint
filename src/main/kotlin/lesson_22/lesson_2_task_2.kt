package lesson_22

fun main() {
    val numberOfWorkers = 50
    val salaryOfWorker = 30000
    val numberOfTrainees = 30
    val salaryOfTrainee = 20000
    val totalSalariesWorkers: Int
    val totalSalariesAll: Int
    val averageSalary: Int

    totalSalariesWorkers = numberOfWorkers * salaryOfWorker
    totalSalariesAll = totalSalariesWorkers + numberOfTrainees * salaryOfTrainee
    averageSalary = totalSalariesAll / (numberOfWorkers + numberOfTrainees)

    println("Расходы на выплату ЗП постоянных сотрудников\t$totalSalariesWorkers")
    println("Расходы на выплату ЗП всех сотрудников\t\t\t$totalSalariesAll")
    println("Средняя ЗП по организации\t\t\t\t\t\t$averageSalary")

}

