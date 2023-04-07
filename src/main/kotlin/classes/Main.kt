import classes.Person

fun main(){
    val person = Person()

    /*
     // kotlin has default getter and setters
    person.firstName
    person.lastName
    person.nickName = "Boy"
    person.nickName = "new nickname"

    println(person.nickName)
     */
    person.nickName = "stupid"

    person.printInfo()


}