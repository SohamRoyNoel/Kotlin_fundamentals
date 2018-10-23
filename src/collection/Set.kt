package collection

fun main(args: Array<String>){

    // SET contains unique elements
    // HASH SET also contains unique elements but SEQUENCE is not guaranteed in output

    val mySet = setOf<Int>(2,15,62,0,10,36,85,74)
    var myset1 = mutableSetOf<Int>() //this case is mutable
    myset1.add(1)
    myset1.add(25)
    myset1.add(10)

    var myset2 = hashSetOf<Int>()
    myset2.add(500)
    myset2.add(50)
    myset2.add(10)
    myset2.add(0)

    for (v in mySet){
        print("$v ")
    }

    println()
    for (v in myset1){
        print("$v ")
    }

    println()
    for (v in myset2){
        print("$v ")
    }
    /*
            2 15 62 0 10 36 85 74
            1 25 10
            0 50 500 10
    */
}

