package collection


fun main(args: Array<String>){

    // listOf makes a list MUTABLE : ArrayList, arrayListOf, mutableListOf
    var myList = mutableListOf<String>("Tom", "Dick", "Marry")

    for (e in myList){
        print("${e} ")
    }

    println()

    for (index in 0..myList.size - 1){
        print("${myList[index]} ")
    }

    println()

    for (index in 0..myList.size - 1){
        print("${index} ")
    }

    println()

    for (index in 0..myList.size - 1){
        print("${myList.get(index)} ")
    }
    /*
            Tom Dick Marry
            Tom Dick Marry
            0 1 2
            Tom Dick Marry
    */

    // Add element on the go
    println()

    myList.add("Juliet")
    for (e in myList){
        print("${e} ")
    }

    // REMOVE element on the go
    println()

    myList.remove("Tom")
    for (e in myList){
        print("${e} ")
    }

    // REMOVE ALL element on the go
    println()


    for (e in myList){
        print("${e} ")
    }
}