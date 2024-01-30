package lesson_1

fun main(){

    val numberOfApplication: Int = 75
    val messageText: String = "Благодарим за покупку!"

    println("Количество зявок: $numberOfApplication")
    println("Текст в чеке - $messageText")

    var numberOfEmployees: Int = 2000

//    println("Количество работников интернет-магазина - $numberOfEmployees")

    --numberOfEmployees

    println("Актуальное количество работников интернет-магазина - $numberOfEmployees")

}