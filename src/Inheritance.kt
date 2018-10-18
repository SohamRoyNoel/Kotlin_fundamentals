fun main(args: Array<String>) {
    var dog = Dog()
    dog.color = "Blue"
    dog.bread="Asshole"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
}
/*
        Bark
        Eat
        Meow
        Eat
        Eat
* */

// AS classes in Kotlin are PUBLIC & FINAL you can't direct inherit them :: rather using OPEN
open class Animal {         // Super class / Parent class /  Base class

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {      // Sub class / Child class / Derived class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {      // Sub class / Child class / Derived class

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}