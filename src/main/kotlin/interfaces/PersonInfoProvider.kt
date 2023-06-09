package interfaces

import classes.Person

interface PersonInfoProvider{
    val providerInfo : String
    fun printInfo(person : Person){
        println(providerInfo)
        person.printInfo()
    }
}
