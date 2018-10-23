package collection


fun main(args: Array<String>){

    // listOf makes a list MUTABLE
    var myList = listOf<String>("Tom", "Dick", "Harry")

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
            Tom Dick Harry
            Tom Dick Harry
            0 1 2
            Tom Dick Harry
    */
}