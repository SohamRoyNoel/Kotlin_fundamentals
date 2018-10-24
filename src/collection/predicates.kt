package collection

// all :: Do all element satisfy the predicate
// any :: Do all element satisfy the predicate,
// count :: Total element that satisfy the predicate,
// find :: Returns the first element that satisfy predicate

fun main(args: Array<String>){

    /*
            // val numbers = listOf<Int>(2,3,4,5,82,0,90)
            val numbers = listOf(2,3,4,5,82,0,90)
            val check1 = numbers.all { it > 10 }            // Are all elements greater than 10?
            println(check1) // false

            val check2 = numbers.any {it>10}                // Does any of these elements satisfy the predicate?
            println(check2) // true

            val check3 =  numbers.count{ it>10 }            // Number of elements that satify the predicate.
            println(check3) // 2

            val check4 = numbers.find { it > 10 }           // Returns the first number that matches the predicate
            println(check4) //82
    */

    val myPredicate = { num:Int -> num > 10 }
    val numbers = listOf(2,3,4,5,82,0,90)
    val check1 = numbers.all (myPredicate)
    println(check1) // false

    val check2 = numbers.any (myPredicate)
    println(check2) // true

    val check3 =  numbers.count(myPredicate)
    println(check3) // 2

    val check4 = numbers.find(myPredicate)
    println(check4) //82
}