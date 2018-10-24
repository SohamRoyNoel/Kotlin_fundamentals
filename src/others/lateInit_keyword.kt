package others

// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it
// If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException

fun main(args: Array<String>) {
    var ob = Country()
    // println("From main : ${ob.name}") // Error

    ob.name = "Koria"
    println("From main : ${ob.name}")

    ob.spd()
}

class Country {
    lateinit var name:String

    fun spd(){
        this.name = "Japan"
        println("From Method : $name")
    }
}