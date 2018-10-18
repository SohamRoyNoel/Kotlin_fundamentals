fun main(args: Array<String>) {
    var dog = Dog123("White", "BUTT")
}


open class Animal123 {
    var _color:String = ""
    constructor(color: String) { // this calls the primary Const
        // initialize color variable
        this._color = color
        println("FROM Animal : ${color}")
    }
}

// remove () from animal
class Dog123 : Animal123 {
    var _breed: String = ""

    // call the PRIMARY Const BY COLOR
    constructor(color:String, breed:String):super(color){
        this._breed = breed
        println("FROM DOG : ${color} ---> ${_breed}")
    }
}
