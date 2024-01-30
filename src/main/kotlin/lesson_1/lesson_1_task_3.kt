package lesson_1

fun main(){

    val year = "1961" //год полёта в космос
    var hour:String //час взлёта или час посадки
    var minute:String //минута взлёта или минута посадки

    hour = "09"
    minute = "07"

//    println("Год полёта в космос - $year")
//    println("Час взлёта - $hour")
//    println("Минута взлёта - $minute")
    println("Год полёта в космос - $year \nЧас взлёта - $hour \nМинута взлёта - $minute")

    hour = "10"
    minute = "55"

    print("Время посадки - $hour:")
    print(minute)
    println()

}