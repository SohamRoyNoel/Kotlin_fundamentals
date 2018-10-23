package collection

fun main(args: Array<String>){
    // Map Tutorial : key-value Pair

    //this case is immutable :: so use VAL instead of VAR [HashMap, mutableMapOf, hasMapOf] -> All are same
    val myMap = mapOf<Int, String>(5 to "Dishani", 6 to "Soham", 77 to "Anna")
    var myMap1 = HashMap<Int, String>() //this case is mutable
    myMap1.put(1, "Dishani")
    myMap1.put(25, "Soham")
    myMap1.put(10, "Dishani_Soham")

    for (key in myMap.keys){
        println("Only Keys : $key")
        println("Only Values : ${myMap.getValue(key)}")
        println("Only Values : $myMap.getValue(key)")
    }
    /*
            Only Keys : 5
            Only Values : Dishani
            Only Values : {5=Dishani, 6=Soham, 77=Anna}.getValue(key)
            Only Keys : 6
            Only Values : Soham
            Only Values : {5=Dishani, 6=Soham, 77=Anna}.getValue(key)
            Only Keys : 77
            Only Values : Anna
            Only Values : {5=Dishani, 6=Soham, 77=Anna}.getValue(key)
    */
    println()
    for (key in myMap1.keys){
        println("Only Keys : $key")
        println("Only Values : ${myMap1.getValue(key)}")
    }
    /*
            Only Keys : 1
            Only Values : Dishani
            Only Keys : 25
            Only Values : Soham
            Only Keys : 10
            Only Values : Dishani_Soham
    */
    myMap1.replace(10, "Dish_Soh")
    println()
    for (key in myMap1.keys){
        println("Only Keys : $key")
        println("Only Values : ${myMap1.getValue(key)}")
    }
}