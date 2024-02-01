package lesson_24

fun main(){
    val ironOreMain = 11.0
    val crystalOreMain = 7.0
    val ironOreBaff: Int
    val crystalOreBaff: Int
    val percentBaff = 20.0

    ironOreBaff = (ironOreMain * percentBaff / 100).toInt()
    crystalOreBaff = (crystalOreMain * percentBaff / 100).toInt()

    println("Дополнительное количество железной руды:\t\t$ironOreBaff")
    println("Дополнительное количество кристаллической руды:\t$crystalOreBaff")
}