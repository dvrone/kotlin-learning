fun main() {
	val fixed: List<Int> = listOf(1, 2, 3)
	println(fixed)

	val items: MutableList<String> = mutableListOf("a", "b", "c")
	println(items)
	items.add("d")
	println("items.add(\"d\"): $items")
	items.remove("a")
	println("items.remove(\"a\"): $items")
	println("items[0]: ${items[0]}")
	// println("items[10]: ${items[10]}")
	println("items.size: ${items.size}")
	println("b" in items)
}
