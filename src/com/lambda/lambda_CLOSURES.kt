package com.lambda

fun main(args: Array<String>){
    val pg = Programs1()

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

    // TRY 4 : in this case we are using *res*; in case we dont need to use RETURN; SO change the signature from *Int* to *Unit*
    // In kotlin we have right to MODIFY OUTSIDE VARIABLE INSIDE A LAMBDA Exp. is called CLOSURES
    // we are modifying *res* variable inside LAMBDA Exp.
    var res:Int = 0
    pg.addTwoNumbers1(20,20, {no1, no2-> res = no1 * no2})
    println(res)
}

class Programs1 {
    fun addTwoNumbers(a:Int, b:Int, action: (Int)->Unit){
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action: (Int, Int) -> Int){
        val res = action(a, b) // no1*no2 = a*b = 10*15 = 150
        println(res)
    }

    fun addTwoNumbers1(a:Int, b:Int, action: (Int, Int) -> Unit){
        // it simply replaces [res = no1 * no2]
        action(a,b) // res = no1 + no2 = a+b = 20*20 = 400
    }
}