fun main(args: Array<String>){
    println(MyClasses.companionMethod("this is initiated like OBJECT"))
    var ob = MyClasses()
    println(ob.outsideCompanionObject("this is initiated like normal class"))
}

class MyClasses {
    companion object {
        var counts:Int = -1
        // to call it from JAVA
        @JvmStatic
        fun companionMethod(str:String) : String{
            return "called from COMPANION METHOD : ${str}"
        }
    }

    fun outsideCompanionObject(str: String):String{
        return "called from outside of COMPANION METHOD : ${str}"
    }
}