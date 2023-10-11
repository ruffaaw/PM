var hasCredit: Boolean = false
val universityName: String = "Cracow University of Technology"
val studentName: String = "Rafal Ciupek"
val studentNumberIndex: Int = 138052

val studentPoints: Int = 20

fun main(args: Array<String>) {
    auraColor(studentPoints)
}
fun printStudentStatus(studentName: String, auraColor: String) {
    println("$studentName has a $auraColor face color")
}
fun auraColor (studentPoints: Int = 2) {
    val satisfactionLevel = (Math.pow(Math.random(), (110 - studentPoints) / 100.0) * 20).toInt()

    val auraColor = when (satisfactionLevel) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "unknown"
    }
    printStudentStatus(auraColor, studentName)
}