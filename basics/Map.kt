fun main() {
	val ages = mutableMapOf("ali" to 20, "vali" to 22)
	ages["sami"] = 19
	println(ages)
	println(ages["ali"])

	for ((name, age) in ages) {
		println("$name: $age")
	}
}
