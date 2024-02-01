package lesson_25

fun main (){
    var depositAmount = 70000.0
    val depositRate = 16.7
    val coeff = (1 + depositRate / 100)
    val depositTerm = 20
    val depositAmountFinal: String

    for (n in 1..depositTerm){
        depositAmount = depositAmount * coeff
    }

    depositAmountFinal = String.format("%.3f", depositAmount)

    println("Размер вклада через $depositTerm лет составит $depositAmountFinal")
}