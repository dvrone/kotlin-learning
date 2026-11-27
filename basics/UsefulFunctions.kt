fun main() {
	val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)
	println(nums.filter { it % 2 == 0 })
	println(nums.map { it * 10 })
	println(nums.sum())
	println(nums.first())
	println(nums.any { it > 5 })
	println(nums.sortedDescending())
}
