package inheretence

import classes.Person
import interfaces.BasicInfoProvider
import interfaces.checkType

// you can't inherit like below , by default classes are final
// first make them "open" and then inherit
// similarly to override

//class FancyInfoProvider : BasicInfoProvider(){
//}

class FancyInfoProvider : BasicInfoProvider(){
    override val providerInfo: String
    // get() = super.providerInfo
    get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyPrintInfo")
    }

    override val sessionIdPrefix: String
        get() = "Fancy Session"


}

fun main(){
    val provider2 = FancyInfoProvider()
    provider2.printInfo(Person())
    println(provider2.getSessionId())
    checkType(provider2)
}

