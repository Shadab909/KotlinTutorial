package functions_3

fun main(){
    val list = listOf("Kotlin","Java",null,"Javascript","Python","C","C++",null,null)

    list
        .filterNotNull()// filters out all null values
        .filter {
            it.startsWith("C")
        }
        .map{           // replaces String with length
            it.length
        }
        .forEach {
            println(it)
        }


    println()
    list
        .filterNotNull()
        //.take(3)      // takes first 3 elements
        //.takeLast(3)    // takes last three elements
        .associate { it to it.length }// returns map
        .forEach {
            println("${it.value} , ${it.key}")
        }

    val map =
        list
            .filterNotNull()
            .associate { it to it.length }


    // retrieve elements
    val language = list.filterNotNull().findLast{it.startsWith("uum")}.orEmpty()
    // other function - last(), find() , findLast{ it.startWith("Java")}
    // , orEmpty(){return a non-null string or static empty string if things
    // didn't go well











}