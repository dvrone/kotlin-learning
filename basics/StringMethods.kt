fun main() {
    val s: String = "Hello, World!"
    val s2: String = ""

    println("s = \"$s\"")
    println("s2 = \"\"")
    println("s.length: ${s.length}")
    println("s.uppercase(): ${s.uppercase()}")
    println("s.lowercase(): ${s.lowercase()}")
    println("s.substring(0, 5): ${s.substring(0, 5)}")
    println("s.contains(\"Hello\"): ${s.contains("Hello")}")
    println("s.startsWith(\"He\"): ${s.startsWith("He")}")
    println("s.replace(\"World\", \"Kotlin\"): ${s.replace("World", "Kotlin")}")
    println("s.split(\",\"): ${s.split(",")}")
    println("s[0]: ${s[0]}")
    println("s.reversed(): ${s.reversed()}")
    println("s2.isEmpty(): ${s2.isEmpty()}")
    println("s.isNotBlank(): ${s.isNotBlank()}")
    println("\"   space   \".trim(): \"${"   space   ".trim()}\"")
}
