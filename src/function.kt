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

    // calling classXIII
    var ob2 = classXIII()
    ob2.numbers = 200
    ob2.counter()

    // without STRING INTERPOLATION
    println("This is from main : " + ob2.numbers)

    // with STRING INTERPOLATION
    println("This is from main-INTERPOLATED : ${ob2.numbers}")
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

// dong the same as classXII
class classXIII{
    var numbers:Int = 0
    fun counter(){
        println("Number is : " + numbers * 50);
    }
}