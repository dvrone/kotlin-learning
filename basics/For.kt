fun main() {
    for (i in 1..5) {
        println(i)
    }

    val names = listOf("Ali", "John", "Alex", "Jane")
    for (name in names) {
        println(name)
    }

    for ((index, name) in names.withIndex()) {
        println("$index. $name")
    }

    // println(names)
    // println(names.withIndex())
}
