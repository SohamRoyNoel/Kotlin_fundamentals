/** FILTER
 * Returns a list containing only elements matching the given [predicate]
 * */

/** MAP
 * Returns a list containing the results of applying the given [transform] function
 * to each element in the original collection
 * */

/*
* Default they returns the type
* */

package collection

fun main(args: Array<String>){

    val mylist: List<Int> = listOf(10,15,25,30,35,40)

    // Filter
    val filtered = mylist.filter { x -> x > 20 }   // mylist.filter { it > 20 }
    for (num in filtered){
        print("$num ") // 25 30 35 40
    }

    println()

    // Map
    val maped = mylist.map { it * it } // mylist.map { v -> v * v }
    for (m in maped){
        print("$m ") // 100 225 625 900 1225 1600
    }

    println()

    // Filter + Map
    val filteredMap = mylist.asSequence().map { it * it }.filter { it > 1000 }.toList()
    for (f in filteredMap){
        print("$f ") // 1225 1600
    }

    println()

    // Example
    // listOf returns list; that PERTICULAR datatype :: So we dont need to mention it EXPLICITLY
    // val personH = listOf<Person>(Person(20, "Dishani"), Person(20, "Soham"), Person(20, "Dish"))
    // Person class in called inside *listOf*; so the listOf got a type of *Person* default

    val personH = listOf(Person(20, "Dishani"), Person(14, "Soham"), Person(20, "Dish"))
    // Test 1
    val name = personH.asSequence().filter { it.name.startsWith("D") }.map { it.name }.toList()
    for (p in name){
        print("$p ")
    }

    println()

    // Test 2
    val names = personH.asSequence().filter { it.age > 16 }.map { it.name.startsWith("D") }.toList()
    for (p in names){
        print("$p ")
    }

    // Test 3
    val names1 = personH.asSequence().filter { it.name.startsWith("D") }.map { it.age > 16 }.toList()
    for (p in names1){
        print("$p ")
    }
}

class Person(var age:Int, var  name: String)