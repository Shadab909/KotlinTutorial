package practice



fun main(){

    val car = Car()
    car.start()
}

class Engine(){
    fun start(){
        println("Engine X started")
    }
}

class Car1(val engine : Engine){
    fun start (){
        println("Car started ... ${engine.start()}")
    }
}

class Car(){

    private val engine = Engine()
    val text = engine.start()
    fun start (){
        println("I am confused")
        println("Car started ... ")
    }
}