package functions_3


// HigherOrderFunctions return another functions or take a function as a parameter

fun printFilteredStrings(list :List<String>,predicate : (String) -> Boolean){
    list.forEach {
        if (predicate(it)){
            println(it)
        }
    }
}

// for nullable function parameter
fun nullablePrintFilteredStrings(list :List<String>,predicate : ((String) -> Boolean)?){
    list.forEach{
        if (predicate?.invoke(it) == true){
            println(it)
        }
    }
}

// kotlin allows us to define variable of function type here it is "predicate"
val predicate : (String) -> (Boolean) = {
    it.startsWith("C")
}

// function that returns another function
fun getPrintPredicate() : (String) -> (Boolean){
    return {it.startsWith("C")}
}

fun main(){
    val list = listOf("Kotlin","Java","Javascript","Python","C","C++")
    //one way (lambda passed within parenthesis)
    printFilteredStrings(list,{it.startsWith("K")})

    // other standard way -> ( if the last parameter of a function is a function
    // then lambda can be specified outside the function body)
    println()
    printFilteredStrings(list){
        it.startsWith("J")
    }


    println()
//    printFilteredStrings(list , predicate)
    printFilteredStrings(list , getPrintPredicate())


    println()
    nullablePrintFilteredStrings(list,null)
}