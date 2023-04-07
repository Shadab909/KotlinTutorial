package classes

//primary constructor
class Person (private val firstName:String = "Amit",
              private val lastName:String="Kumar"){
    /*

    // init block is used to initialize and is run firstly as per their order
    init {
        println("init 1")
    }

  //secondary constructor
    constructor() : this("Amit","Kumar"){
        println("Secondary Constructor")
    }

    init {
        println("init 2")
    }

 */

    var nickName : String? = null
        set(value) {
            field = value

            println("New Nick name is $value ")
        }
        get() {
            println("the return value is $field")
            return field
        }

    fun printInfo(){

        // elvis operator "?:" is used to simplify below code
        // val nickNameToPrint = if (nickName != null) nickName else "no nickname"

        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}






/*
  VISIBILITY MODIFIER
  Four visibility modifiers in Kotlin: private, protected, internal, and public.
  The default visibility is public.

  PUBLIC
  If you don’t use a visibility modifier, public is used by default, which means
  that your declarations will be visible everywhere.

  PRIVATE
  If you mark a declaration as private, it will only be visible inside the file
  that contains the declaration.

  INTERNAL
  If you mark it as internal, it will be visible everywhere in the same module.

  PROTECTED
  The protected modifier is not available for top-level declarations.

 */
