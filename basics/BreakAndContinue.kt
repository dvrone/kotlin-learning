fun main() {
    for (i in 1..10) {
        if (i == 3) continue
        if (i == 6) break
        println(i)
    }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5) continue
            if (i == 7) continue@outer
            if (j == 4) break
            if (i == 9) break@outer
            println("$i * $j = ${i*j}")
        }
        println()
    }
}
