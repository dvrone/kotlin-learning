fun main() {
    print("What is your name?: ")
    val name: String = readln()
    print("Okay, $name, how old are you?: ")
    var age: Int = readln().toInt()
    println("You are $name, and you are $age y.o.")
    println("Next year you will be ${age + 1}")
}
