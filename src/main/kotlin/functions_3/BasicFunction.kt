package functions_3

fun main(){
    println(getGreetings())
    sayHello()
    println(nullableGetGreeting())
    println(singleExpressionFunction())
    println(typeInferenceSingleExpressionFunction())
}

fun getGreetings():String {
    return "Work Hard"
}


/*
 Unit is used as return type to tell that this
 function returns nothing useful or simply nothing

 like below
            fun sayHello(): Unit {
                println(getGreetings())
            }
  Unit can also be omitted
              fun sayHello(){
                println(getGreetings())
            }
*/

fun sayHello(): Unit {
    println(getGreetings())
}

// nullable return type
fun nullableGetGreeting() : String ? {
    return null
}

// single expression function
fun singleExpressionFunction() : String = "Hi"

// single expression function with Type Inference
fun typeInferenceSingleExpressionFunction() = "Hi"
