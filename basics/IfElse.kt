fun main() {
    val score: Int = 85

    if (score >= 90) {
        println("Excellent")
    } else if (score >= 70) {
        println("Good")
    } else {
        println("Satisfactory")
    }

    val result: String = if (score >= 60) "Passed" else "Failed"
    println(result)
}
