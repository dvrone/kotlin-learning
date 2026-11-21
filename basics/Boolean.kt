fun main() {
    val age: Int = 20
    val isAdult: Boolean = age >= 18
    val hasTicket: Boolean = true
    
    val canEnter = isAdult && hasTicket

    val needsHelp = !isAdult || !hasTicket

    if (canEnter) println("Welcome!") else println("Sorry, you cannot enter.")
    if (needsHelp) println("Do you need some help?")
}
