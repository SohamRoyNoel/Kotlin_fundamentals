fun main(Args: Array<String>){
    var ob = Students("Cooper") //MY name is : Cooper

    var ob1 = Students12("Coopers") // MY name is : Coopers

    var ob123 =  Students123("JP");
    println("Name : ${ob123.__name}") // Name : JP
}

// Name can't be accessed from other method; BCZ its acting like a PARAMETER only
// name is not a PROPERTY of the class
class Students constructor(name: String){

    // INIT works like constructor as it is fired WHEN THE CLASS IS INITIATED
    init {
        println("MY name is : ${name}")
    }
}

// SAME AS ABOVE
class Students1(name: String){
    init {
        println("MY name is : ${name}")
    }
}

// PROPERTY inside the PRIMARY CONSTRUCTOR
class Students12(var _name: String){
    init {
        println("MY name is : ${_name}") //MY name iss : JP
    }
}

// General AS JAVA
class Students123(name: String){
    var __name:String = "DummyVal"
    init {
        this.__name = name
        println("MY name iss : ${name}")
    }
}