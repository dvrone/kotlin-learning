class Person(val name: String, var age: Int) {
	fun introduce() {
		println("I am $name and I am $age y.o")
	}

	fun birthday() {
		age++
	}
}

fun main() {
	val p = Person("Ali", 20)
	p.introduce()
	p.birthday()
	p.introduce()
}
