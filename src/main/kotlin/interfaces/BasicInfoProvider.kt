package interfaces

import classes.Person

// abstract class doesn't need to implement all the methods
// can't create instance of abstract class like below
//abstract class BasicInfoProvider : PersonInfoProvider

open class BasicInfoProvider : PersonInfoProvider , SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    // available in child class
    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("overridden")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

}

fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    println(provider.getSessionId())

    checkType(provider)

    //other way around
     val provider3 = object : PersonInfoProvider{
         override val providerInfo: String
             get() = "Object person info provider"

         fun getSessionId() = "Hi"
     }

    provider3.printInfo(Person())
    println(provider3.getSessionId())

    checkType(provider3)

}

fun checkType(infoProvider: PersonInfoProvider){
    println()
    if (infoProvider !is SessionInfoProvider){
        println("is not a session info provider")
    }else{
        println("is a session info provider")
        // no need to cast here
        // (infoProvider as SessionInfoProvider).getSessionId()
        println(infoProvider.getSessionId())
    }
}



























