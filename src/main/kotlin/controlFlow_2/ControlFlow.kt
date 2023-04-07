package controlFlow_2

var greetings : String ? = null

fun main()
{
    greetings = "Salaam"

    //if - else statement
    if (greetings != null)
        println(greetings)
    else
        println("Its null")

    println()
    //when statement like switch statement in java
    when(greetings)
    {
        null -> println("Its null")
        "hi" -> println("Interesting")
        else -> println(greetings)
    }

    println()
    //if-else to assign values
    // here greetingToPrint is local variable
    var greetingToPrint = if (greetings != null) greetings else "Its null"
    println(greetingToPrint)

    greetings = null
    println()
    //when statement to assign values
    greetingToPrint = when(greetings)
    {
        null-> "Its null"
        else -> greetings
    }

    println(greetingToPrint)

}