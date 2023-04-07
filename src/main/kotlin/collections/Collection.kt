package collections

fun main(){
    val arrayThings = arrayOf("kotlin","books","tutorials")
    println(arrayThings.size)
    println(arrayThings[0])
    println(arrayThings.get(1))

    println()
//  iterating through each element in array
    for (arrayThing in arrayThings){
        println(arrayThing)
    }

    println()
//  lambda expression in forEach
    arrayThings.forEach { arrayThing ->
        println(arrayThing)
    }

    println()
//   with index forEachIndexed
    arrayThings.forEachIndexed { index, arrayThing ->
        println("$index $arrayThing ")
    }


// just like arrayOf but with more functions and flexibility
    val listThings = listOf("KOTLIN","JAVA","SWIFT","GO")

// map collection (key to value)
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    println()
    map.forEach { (key, value) -> println("$key -> $value")  }

    /*
       collection stuff in kotlin are by default
       non-mutable
       To get mutable collections we use mutable
       keyword with them . Ex
                 mutableListOf() , mutableMapOf() etc
      */

    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map2.put(4 , "d")

    println()
    helloCollection("Hello", listOf("a","b","c","d"))
    println()
    varargHelloCollection("Hello","Apple","Ball","Cat","Dog")

    //when you are getting the vararg array from a server then
    // you can pass then to vararg function like bellow
    println()
    varargHelloCollection("Salaam",*arrayThings)

    //named parameters
    // limitation: if using named parameters then use it for all aparams
    println()
    greetPersons(name = "Shadab" , greeting = "SayHello")

    // since function has default parameters so no error even no parameters passed
    println()
    greetPersons()

}

fun helloCollection(greeting:String ,
                     itemsToGreet : List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

//vararg allows taking variable number of strings here ,
// it will act like an array
fun varargHelloCollection(greeting:String ,
                  vararg  itemsToGreet : String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// function with default parameters
fun greetPersons(greeting : String = "Hello" , name : String = "Shadab" )
              = println("$greeting $name")


