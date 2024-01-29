package lesson_1

fun main(){
    val lenght: Long = 40_868_600_000L //Расстояние (в мм)
    val age: Byte = 27 //Возраст
    val partOfDay: Float = 0.075F //Часть дня
    val seconds: Short = 6480 //Количество секунд
    val partOfYear: Double = 2.0547945205479453E-4 //часть года
    val apogee: Int = 327000 //Величина апогея орбиты (в м)

    println("Расстояние (в мм):\t\t$lenght")
    println("Возраст (полных лет):\t$age")
    println("Часть дня:\t\t\t\t$partOfDay")
    println("Количество секунд:\t\t$seconds")
    println("Часть года:\t\t\t\t$partOfYear")
    println("Величина апогея (в м):\t$apogee")

}