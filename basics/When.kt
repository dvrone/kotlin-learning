fun main() {
    val day: Int = 3
    val name: String = when (day) {
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4,5 -> "thursday or friday"
        in 6..7 -> "day off"
        else -> "unknown"
    }
    println(name)

    val score: Int = 85
    val grade: String = when {
        score >= 90 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        else -> "F"
    }
    println(grade)
}
