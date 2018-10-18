fun main(args: Array<String>) {
    var dog = Dog12("White", "BUTT")
}


open class Animal12(var color: String) {
    init {
        println("Color From BASE: ${color}")
    }
}

// 1. Call PRIMARY Const
// 2. SEQUENCE should be maintained :: PRIMARY Const -> 1st ;
class Dog12(color:String, var breed: String) : Animal12(color) {
    init {
        println("Color DERIVED : ${color} ---> ${breed}")
    }
}
