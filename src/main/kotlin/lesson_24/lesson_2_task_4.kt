package lesson_24

fun main(){
    val ironOreMain = 11.0
    val crystalOreMain = 7.0
    val baff = 0.2
    val ironOreBaff: Int
    val crystalOreBaff: Int

    ironOreBaff = (ironOreMain * baff).toInt()
    crystalOreBaff = (crystalOreMain * baff).toInt()

    println("Дополнительное количество железной руды:\t\t$ironOreBaff")
    println("Дополнительное количество кристаллической руды:\t$crystalOreBaff")
}