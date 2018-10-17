fun main(args:Array<String>){
    val r1 = 1..5 // 1 2 3 4 5

    val r2 = 5 downTo 1 // 5 4 3 2 1

    val r3 = 1 to 10 // 1 2 3 ... 9 10

    val r4 = 5 downTo 1 step 2 // 5 3 1

    var r5 = 'a'..'z' // "a","b","c" ... "z"

    val isPresent = 'c' in r5 // True or False

    var r6 = 10.downTo(1) // 10 9 8 ... 1

    var r7 = 1.rangeTo(10) // 1 2 3 ... 10
}