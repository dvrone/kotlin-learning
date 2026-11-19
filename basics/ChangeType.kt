fun main() {
    val x: Int = 5
    val y: Double = x.toDouble()
    val s: String = "123"
    val n: Int = s.toInt()
    val safe: String = "abc"
    // val safeNumber: Int = safe.toIntOrNull()
    val safeNumber: Int? = safe.toIntOrNull()

    println("x: $x")
    println("y: $y")
    println("n: $n")
    println("safe: $safe")
    println("safeNumber: $safeNumber")
}
