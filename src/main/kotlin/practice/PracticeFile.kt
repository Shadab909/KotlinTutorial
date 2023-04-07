package practice


    fun main(args: Array<String>){

        print("Enter a number : ")
        val input = readLine()
        val a = input!!.toInt()

        for (i in 0..a){
            for(j in 0..i){
                print("8")
            }
            println()
        }

    }
