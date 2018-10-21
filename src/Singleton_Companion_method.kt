// by the help of companion method :: we can force a method to behave IN STATIC
fun main(args: Array<String>){
    println(MyClass.companionMethod("this is initiated like OBJECT"))
    var ob = MyClass()
    println(ob.outsideCompanionObject("this is initiated like normal class"))
}

class MyClass {
    //companion object doesnt need a name :: it uses the main classes name
    companion object {
        var counts:Int = -1
        fun companionMethod(str:String) : String{
            return "called from COMPANION METHOD : ${str}"
        }
    }

    fun outsideCompanionObject(str: String):String{
        return "called from outside of COMPANION METHOD : ${str}"
    }
}