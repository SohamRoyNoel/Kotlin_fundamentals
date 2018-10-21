package com.lambda

fun main(args: Array<String>){
    val pg = Program()
    pg.addTwoNumbers(10,20)

    pg.addTwoNmbers(10,25, object : MyInterfaces {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    // myLambda is a function; where *(Int)-> Unit* is PARAMETER type of [INT] and RETURN type is [UNIT]
    val myLambda : (Int)-> Unit = {s:Int-> println(s)}
    // so the myLambda function is passsed under another function pg.addTwoNumbers
    // this is why LAMBDA IS CALLED HIGH LEVEL FUNCTION
    pg.addTwoNumbers(20,30, myLambda)

    // or pass FUNCTION & LAMBDA all in one go
    pg.addTwoNumbers(20, 40, {p:Int-> println("from LAMBDA : ${p}")})

}

class Program {
    // to accept lambda we need to create a higher order function
    // action GRANTS the DATATYPE
    fun addTwoNumbers(a:Int, b:Int, action: (Int)->Unit){
        val sum = a + b
        action(sum)
    }

    //Implementation of INTERFACE - OOP Way
    fun addTwoNmbers(a:Int, b:Int, action: MyInterfaces){
        val sum = a+b
        action.execute(sum)

    }

    fun addTwoNumbers(a:Int, b: Int){
        val sum = a + b
        println(sum)
    }
}

interface MyInterfaces{
    fun execute(sum: Int)
}