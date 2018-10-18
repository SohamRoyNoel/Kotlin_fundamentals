/*
*
* All Infix Function are extension Function BUT all extension Functions are not Infix Function
*
* Infix Function should have only ONE PARAMETER
*
*/

fun main(Args: Array<String>){

    val x:String = "Bull "
    val y:String = "Shit "
    val z:String = "Christ "

    val addThrees = x.addThrees(y, z)
    println(addThrees)

    // using INFIX is sexy........ isn't?
    val peinter = x printer y
    println(peinter)

}


fun String.addThrees(s1:String, s2:String) : String { //Extension Function
    return this + s1 + s2
}

infix fun String.printer(str: String):String{ //Extension Function + Infix Function
    return str
}