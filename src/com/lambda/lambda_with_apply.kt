package com.lambda

fun main(args: Array<String>){
    var ob = Person()
    ob.name = "Yoo Baby"
    ob.age = 50
    println(ob.name)
    println(ob.age)

    with(ob){
        name = "Christ"
        age = 2018
        radicalPerson("inside WITH", 13)
    }
    println(ob.name)
    println(ob.age)

    ob.apply {
        name = "Kamakazi"
        age = 150
    }.radicalPerson(ob.name, ob.age)
    println(ob.name)
    println(ob.age)
}

class Person {
    var name:String = ""
    var age:Int = 0

    fun radicalPerson(nm:String, sts:Int){
        println("From the method : Name : ${nm}  => ${sts}")
    }
}
/*
            Yoo Baby
            50
            From the method : Name : inside WITH  => 13
            Christ
            2018
            From the method : Name : Kamakazi  => 150
            Kamakazi
            150
 */