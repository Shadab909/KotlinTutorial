package variables_1

// var keyword is used to name variable that can be reassigned i.e. that are mutable
//var mutableName : String  = "My Doctor"

// val keyword is used to name variable that can't be reassigned i.e. that are non-mutable
//val nonMutableName : String = "My Name"

/*
  kotlin supports Type Inference on variables of properties
  it will automatically recognize the type of variable you are defining
  as per what has been assigned to them . Ex -
          var mutableName = "My Doctor" (don't use this way if you want nullables
                                         use the other way)
  kotlin recognized "mutableName" to be a String , so no need to define
  the type with the colon
*/

var mutableName = "My Doctor"

val nonMutableName = "My Name"


// val or var is mandatory

/*
  in kotlin variables are by default non-null that means they can't
  take null values . Ex below code will give error
  var mutableName : String  = "My Doctor"
  mutableName = null (error)

  to make error go , "?" after String . It makes variable nullable
  var mutableName : String ?  = "My Doctor"
  mutableName = null (no error)
*/



fun main(){

    mutableName = "Your Doctor"
    println(mutableName)

    // nonMutableName = "Your Name" (will give error ,  read line 6)
    println(nonMutableName)
}