package collection

fun main(args: Array<String>){
                            // Size   // Initial val
    var myArray = Array<Int>(5){ 0 } // Array is MUTABLE :: Fixed Size

    myArray[0] = 32
    myArray[3] = 74
    myArray[4] = 94

    for (e in myArray){
        print("${e} ")
    }

    println()

    for (index in 0..myArray.size - 1){
        print("${index} ")
    }
}