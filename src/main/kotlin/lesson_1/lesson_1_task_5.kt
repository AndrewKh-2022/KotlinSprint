package lesson_1

fun main(){

    val totalSeconds = 6480
    val seconds: Int
    val minutes: Int
    val hours: Int
    val secondsText: String
    val minutesText: String
    val hoursText: String
    val colon = ":"

    hours = totalSeconds/3600
    minutes = (totalSeconds - hours*3600)/60
    seconds = totalSeconds - hours*3600 - minutes*60

    if(hours<10) hoursText = "0" + hours.toString()
    else hoursText = hours.toString()

    if(minutes<10) minutesText = "0" + minutes.toString()
    else minutesText = minutes.toString()

    if(seconds<10) secondsText = "0" + seconds.toString()
    else secondsText = seconds.toString()

    println(hoursText + colon + minutesText + colon + secondsText)

}