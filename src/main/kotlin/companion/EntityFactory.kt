package companion

import interfaces.IdProvider

class Entity private constructor(val id : String){
    //companion object has access to private properties
    //and methods of the class
    companion object Factory : IdProvider{
        const val id = "id"
        fun create() = Entity("id")
        override fun getId(): String {
            return "123"
        }
    }
}

fun main(){
    val entity = Entity.Factory.create()
    Entity.id
}