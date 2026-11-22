fun add(a: Int, b: Int): Int {
    return a + b
}

fun add2(a: Int, b: Int): Int = a + b

fun greet(name: String) {
    println("Hello, $name")
}

fun greet2(name: String, greeting: String = "Hello") {
    println("$greeting, $name")
}

fun main() {
    println(add(3, 6))
    println(add2(4, 4))
    greet("Bruce")
    greet2("Alex")
    greet2("John", "Hi")
    greet2(greeting = "Welcome", name = "Jane")
}
