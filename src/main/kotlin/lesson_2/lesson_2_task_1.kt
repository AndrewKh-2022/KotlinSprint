package lesson_2

fun main(){
    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5

    val average = (grade1 + grade2 + grade3 + grade4).toFloat() / 4

    val averageRound = String.format("%.2f", average)
    println("Среднеарифметическая оценка: $averageRound")
}