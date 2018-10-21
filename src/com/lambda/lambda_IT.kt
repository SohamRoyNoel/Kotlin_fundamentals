package com.lambda

fun main(args: Array<String>){
    val ob = ProgramsIT()
    ob.reverseDisp("hello", {strs->strs.reversed()})

    // *it* is the name of SINGLE PARAMETER inside LAMBDA Exp
    // this concept is APPLICABLE onlyt we have a SINGLE PARAMETER
    ob.reverseDisp("hello", {it.reversed()})
}

class ProgramsIT {
    fun reverseDisp(str:String, asus:(String)->String){
        var r = asus(str) //it.reversed()=====>str.reversed()==========>"hello".reversed()
        println(r)
    }
}