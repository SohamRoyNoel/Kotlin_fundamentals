package others

/*
        saves waste of memory
        not initialised everywhere unless it is needed
        gets val from cache
        Thread Safe :: It is initialised in the thread where it is used for the fast time

        Can be used with "VAR" or "Val"
*/

val pi: Float by lazy {
    3.14f // Define value
}

fun main(args: Array<String>){
    println("dummy")

    val area = pi * 4 * 4
    println("Area : $area")
}