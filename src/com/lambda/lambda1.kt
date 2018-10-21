package com.lambda


fun main(args: Array<String>){
    val pg = Programs()

    // TRY 1
    val myLambda : (Int)-> Unit = {s:Int-> println(s)}
    pg.addTwoNumbers(20,30, myLambda)

    pg.addTwoNumbers(20, 40, {p:Int-> println("from LAMBDA : ${p}")})


    // TRY 2
    val myLamdas : (Int, Int) -> Int = {no1:Int, no2:Int -> no1*no2}
    pg.addTwoNumbers(10, 15, myLamdas)

    pg.addTwoNumbers(10, 15, {p, q-> p*q})

    // TRY 3
    pg.addTwoNumbers(10,10){p, q -> p*q}
}

class Programs {
    fun addTwoNumbers(a:Int, b:Int, action: (Int)->Unit){
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action: (Int, Int) -> Int){
        val res = action(a, b) // no1*no2 = a*b = 10*15 = 150
        println(res)
    }
}