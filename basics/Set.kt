fun main() {
	val numbers: List<Int> = listOf(1, 2, 2, 3, 3, 4)
	println(numbers)

	val numbersSet: Set<Int> = setOf(1, 2, 2, 3, 3, 4)
	println(numbersSet)

	val numbersSet2: Set<Int> = setOf(1, 2, 3, 4, 5)
	println(numbersSet2)
	println(numbersSet2.size)
	println(2 in numbersSet2)

	val numbersSet3: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
	println(numbersSet3)
	numbersSet3.add(5)
	numbersSet3.add(9)
	numbersSet3.remove(1)
	println(numbersSet3)
}
