package lesson_23

const val numberOfMinutes = 60

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

    hoursOnWay = minutesOnWayTotal / numberOfMinutes
    minutesOnWay = minutesOnWayTotal % numberOfMinutes
    hoursTemp = (minutesDepart + minutesOnWay) / numberOfMinutes
    minutesTemp = (minutesDepart + minutesOnWay) % numberOfMinutes
    hoursArrival = hoursDepart + hoursOnWay + hoursTemp
    minutesArrival = minutesTemp

    timeOfArrival = String.format("%02d:%02d", hoursArrival, minutesArrival)

    println("Время прибытия поезда: $timeOfArrival")

}