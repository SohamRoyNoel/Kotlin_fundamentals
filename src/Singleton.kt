// USED like STATIC method in java
fun main(args: Array<String>){
    /*
            var ob = Data()
            ob.id = 50
            println(ob.id)
            println(ob.datas())

            // Singleton
            println("---------------")
            println(Datam.id)
            println(Datam.datas())
            Datam.id = 1500
            println(Datam.id)
    */
    /*
            50
            Printing from DATA CLASS
            kotlin.Unit
            ---------------
            10
            Printing from DATAM OBJECT
            kotlin.Unit
            1500
    */

    var ob = mySuperClass()
    println(ob.myFun("Super class is initiated"))

    println(Datam.myFun("Static Class initiated from main"))
}

class Data{
    var id:Int = 10
    fun datas(){
        println("Printing from DATA CLASS")
    }
}

open class mySuperClass{
    open fun myFun(x:String):String{ // BEHAVES like NORMAL METHOD
        return x
    }
}

// Object is inheriting a class; so it should be trataed like STATIC CLASS now
// Can't have const bcz we cant create object by this
object Datam : mySuperClass() {
    var id:Int = 10
    fun datas(){                  // BEHAVES like STATIC method
        println("Printing from DATAM OBJECT")
    }

    override fun myFun(x: String): String {  //CURRENTLY BEHAVES like STATIC method
        return super.myFun("From Subclass : ${x}")
    }
    init {
        println("INIT method called")
    }
}