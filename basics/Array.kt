fun main() {
    val cars: Array<String> = arrayOf("Volvo", "BMW", "Ford")
	println(cars.contentToString())
	cars[0] = "Audi"
	println("cars[1]: ${cars[1]}")
	println("cars.size: ${cars.size}")
	println("Ford" in cars)

	for (car in cars) {
		println(car)
	}

	val nums: IntArray = intArrayOf(5, 2, 0, 1)
	nums.sort()
	println(nums.contentToString())
	val zeros: IntArray = IntArray(5)
	println(zeros.contentToString())
}
