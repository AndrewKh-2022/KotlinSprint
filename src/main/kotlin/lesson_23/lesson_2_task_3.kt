package lesson_23

fun main(){
    val hoursDepart = 9
    val minutesDepart = 39
    val hoursArrival: Int
    val minutesArrival: Int
    val hoursOnWay: Int
    val minutesOnWay: Int
    val minutesOnWayTotal = 457
    val hoursTemp: Int
    val minutesTemp: Int
    val timeOfArrival: String

    hoursOnWay = minutesOnWayTotal / 60
    minutesOnWay = minutesOnWayTotal % 60
    hoursTemp = (minutesDepart + minutesOnWay) / 60
    minutesTemp = (minutesDepart + minutesOnWay) % 60
    hoursArrival = hoursDepart + hoursOnWay + hoursTemp
    minutesArrival = minutesTemp

    timeOfArrival = String.format("%02d:%02d", hoursArrival, minutesArrival)

    println("Время прибытия поезда: $timeOfArrival")

}