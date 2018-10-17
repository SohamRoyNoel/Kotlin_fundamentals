/*
* IF as EXPRESSION : cause IF returns value
* */

fun main(args: Array<String>){
    val a =2
    val b =5

    var maxValue:Int = if (a>b){
        println("A is greater")
        a
    } else {
        println("B is greater")
        b
    }

    println("max is : ${maxValue}")
}