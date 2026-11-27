fun main() {
	val square = { x: Int -> x * x }
	println(square(5))

	fun repeatAction(times: Int, action: (Int) -> Unit) {
		for (i in 1..times) action(i)
	}

	repeatAction(3) { i -> println("times: $i") }
}
