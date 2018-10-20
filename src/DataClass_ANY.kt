/*
            a class some standard functionality and utility functions are often mechanically derivable from the data.
            In Kotlin, this is called a data class

            The compiler automatically derives the following members from all properties declared in the primary constructor:

            equals()/hashCode() pair;
            toString()
            componentN() -- functions corresponding to the properties in their order of declaration;
            copy() function
*/
fun main(args: Array<String>){
    /*
        var obu = BigUser("Dishani", 20)
        var obu1 = BigUser("Dishani", 20)
        if (obu == obu1)
            println("Data is Equal")
        else
            println("Data is not equal")
        ----------Data is not equal---------------
    */
    var obu = BigUser1("Dishani", 20)
    var obu1 = BigUser1("Dishani", 20)
    if (obu == obu1)
        println("Data is Equal")
    else
        println("Data is not equal")

    // ----------------------Data is Equal---------------------

    // automatically derived the members - 1
    println(obu) // we are implicitly calling .toString() method
    println(obu.toString())

    // automatically derived the members - 2
    var newUser = obu.copy()
    println("new User is : ${newUser}")
    // assigning new val to newUser
    var newUser1 = obu.copy(name = "Soham", id = 20) // use NAMED CONST to avoid confution for compiler
    println("new User is : ${newUser1}")
}

class BigUser(var name:String, var id:Int){
    // SInce this is not data class; it will return OBJECT instead of values
}

data class BigUser1(var name:String, var id:Int){
    // Since this is a data class it simply compares DATA rather then OBJECTS
}