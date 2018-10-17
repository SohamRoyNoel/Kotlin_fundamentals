fun main(args: Array<String>){
    var vals = max(10, 15)
    println("Greater is : ${vals}") // Greater is : 15

    var vals1 = maxAlter(10, 15)
    println("Greater is : ${vals1}")  // Greater is : 15

    var vals11 = maxAlters(50, 55)
    println("Returned : ${vals11}") // Returned : 100
}

// general function
fun max(a:Int, b:Int):Int {
    if (a > b){
        return a
    } else {
        return b
    }
}

// Function as Expression
fun maxAlter(a:Int, b:Int): Int = if (a > b) a else b

// data present at the end of the block is returned
fun maxAlters(a:Int, b:Int):String =
        if (a>b){
            println("BOOTY a ${a}")
            "${a}"
        }else{
            println("BOOTY b ${b}") //BOOTY b 55
            "100"
        }