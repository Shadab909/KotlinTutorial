package objects

import classes.EntityType
import companion.Entity.Factory.id
import java.util.*


//object declaration is used to create thread safe singleton class
object EntityFactory {
    fun create(type: EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> "Hard"
            EntityType.HELP -> TODO()
        }
        return Entity(id, name)
    }
}


object SealedEntityFactory {
    fun create(type: EntityType) : SealedEntity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY -> SealedEntity.Easy(id,name)
            EntityType.MEDIUM -> SealedEntity.Medium(id,name)
            EntityType.HARD -> SealedEntity.Hard(id,name,2f)
            EntityType.HELP -> SealedEntity.Help
        }
    }
}

class Entity (val id : String , val name : String) {
    override fun toString(): String {
        return "id :$id  name :$name"
    }

}


sealed class SealedEntity (){
    object Help : SealedEntity(){
        const val name = "Help"
    }

    //data class generates methods like toString , equals,hashcode directly for us
    data class Easy(val id:String , val name:String) : SealedEntity(){

        // equals or hashcode or other methods can be overridden

//        override fun equals(other: Any?): Boolean {
//            return super.equals(other)
//        }
//
//        override fun hashCode(): Int {
//            return super.hashCode()
//        }
    }
    data class Medium(val id:String , val name:String) : SealedEntity()
    data class Hard(val id:String , val name:String , val multiplier:Float) : SealedEntity()
}


fun main(){
    var entity = EntityFactory.create(EntityType.HARD)
    println(entity)

    entity = EntityFactory.create(EntityType.MEDIUM)
    println(entity)

    entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val sealedEntity = SealedEntityFactory.create(EntityType.HARD)

    val msg = when(sealedEntity){
        is SealedEntity.Easy -> "Easy class"
        is SealedEntity.Hard -> "Hard class"
        SealedEntity.Help -> "help class"
        is SealedEntity.Medium -> "medium class"
    }
    println()
    println(msg)

     val sealedEntityFactory1 = SealedEntityFactory.create(EntityType.EASY)
     val sealedEntityFactory2 = SealedEntityFactory.create(EntityType.HARD)


    // == operator checks whether the object is equal
    // for below objects it will return they are not
    // equal as both have different ids

    if (sealedEntityFactory1==sealedEntityFactory2)
        println("they are equal")
    else
        println("they are not equal")

    // for == operator below will check equality of sealed class objects
    val sealedEntity1 = SealedEntity.Easy("id","name")
    val sealedEntity2 = SealedEntity.Easy("id","name")

    if (sealedEntity1==sealedEntity2)
        println("they are equal")
    else
        println("they are not equal")

    // === operator checks reference while == operator checks data within object

    if (sealedEntity1===sealedEntity2)
        println("they are equal")
    else
        println("they are not equal")


    // with copy method object can be copied completely or selectively
//    val sealedEntity3 = sealedEntity2.copy(name = "shadab")
    val sealedEntity3 = sealedEntity2.copy()

//    if (sealedEntity3==sealedEntity2)
    if (sealedEntity3===sealedEntity2)
        println("they are equal")
    else
        println("they are not equal")


    val entity2 = SealedEntityFactory.create(EntityType.MEDIUM)
    if (entity2 is SealedEntity.Medium){
        // automatic Smart cast to object.SealedEntity.Medium
        entity2.printInfo()
        entity2.info
    }

    //      or

    SealedEntity.Medium("id","name").printInfo()
    SealedEntity.Medium("id","name").info



}
// extension function (adds function to a class without writing then initially)
fun SealedEntity.Medium.printInfo(){
    println("Medium class $id")
}

// extension property (adds property to a class without writing then initially)
val SealedEntity.Medium.info : String
    get() = "Some info"

