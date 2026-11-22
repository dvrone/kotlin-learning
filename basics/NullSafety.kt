fun main() {
    var a: String = "hello, a"
    // a = null // error

    var b: String? = "hello, b"
    b = null

    val name: String? = null
    val len: Int? = name?.length
    println(len)

    val len2: Int? = name?.length ?: 0
    println(len2)

    if (name != null) println(name.length)

    name?.let { println("name $it") }
}
