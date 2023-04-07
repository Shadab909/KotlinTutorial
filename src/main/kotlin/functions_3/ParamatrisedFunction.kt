package functions_3

//these functions are top level functions not related
//to any class

fun main(){
    hello("Shadaab")
    hello("World!")

    greet("Shabaas","India")
}

//fun Hello (itemToGreet : String){
//    println("Hello $itemToGreet")
//}

// single expression function
fun hello(itemToGreet : String)
       = println("Hello $itemToGreet")

fun greet(greeting : String, itemToGreet: String)
       = println("$greeting $itemToGreet")