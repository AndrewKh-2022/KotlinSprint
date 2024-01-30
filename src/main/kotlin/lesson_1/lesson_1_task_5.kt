package lesson_1

fun main(){

    val totalSeconds = 6480
    val seconds: Int
    val minutes: Int
    val hours: Int

    hours = totalSeconds/3600
    minutes = (totalSeconds - hours*3600)/60
    seconds = totalSeconds - hours*3600 - minutes*60

    val timeInfo = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(timeInfo)

}