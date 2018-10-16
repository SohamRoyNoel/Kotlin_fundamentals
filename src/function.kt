fun main(args: Array<String>){
    var names:String
    names = "Edwin"

    var ob = classX()
    ob.display(names)

    classXI(names)

    // accessing a variable inside function
    var ob1 = classXII()
    ob1.number = 150
    ob1.entry(ob1.number)
}

class classX{
    fun display(name: String){
        println(name)
    }
}

// only using function
fun classXI(name: String){
    println("this is from classXI " + name);
}

// assigning value into function
class classXII{
    var number:Int = 0;
    fun entry(number:Int){
        var x = number * 5
        println("the number is : " + x)
    }
}