fun main(args: Array<String>) {
    val dog = Dogs()
    dog.eat()

    val cat = Cats()
    cat.eat()

    val an = Animals()
    an.eat()
    /*
        Dog is barking
        Cat is mewing
        Animal Eat
    */

    // TRIGGERING the method in BASE and DERIVED class both needs to use SUPER keyword

    println("--------")
    val dog1 = Dogs()
    dog1.eat()
    /*
        Animal Eat -- FOR SUPER call
        Dog is barking --like BEfore
        Cat is mewing  --like BEfore
        Animal Eat  --like BEfore
        --------
        Animal Eat -- FOR SUPER call
        Dog is barking -- FOR SUPER call
    */


    // TRIGGERING property as OVERLOADED -> in cat()
    // CALLING BASE
    val anm = Animals()
    println("COLOR : ${anm.color}")
    // CALLING DEPRIVED
    val cat1 = Cats()
    println("COLOR CAT: ${cat1.color}")
    /*
        COLOR : Animal Color
        COLOR CAT: BLUE CAT
    * */
}



open class Animals {

    // simply use OPEN :: to remove PUBLIC+FINAL nature
    open var color: String = "Animal Color"

    // Unlike Classes methods are also PUBLIC+FINAL in nature; SO we need to use OPEN :: in order to OVERRIDE
    // It gets more presidency
    open fun eat() {
        println("Animal Eat")
    }
}

class Dogs : Animals() {

    var bread: String = ""

    fun bark() {
        println("Bark")
    }

    // an OPEN method can be overridden using the keyword OVERRIDE
    override fun eat(){
        //super.eat() // TO CALL THE METHOD FROM BASE CLASS
        // when inheriting from multiple classes COMPILER may fall in confusion
        // about the real class :: so it's safe to be like
        super<Animals>.eat()
        println("Dog is barking")
    }
}

class Cats : Animals() {

    var age: Int = -1
    // To override a PROPERTY use same OVERRIDE on DERIVED & OPEN on BASE
    override var color:String = "BLUE CAT"

    fun meow() {
        println("Meow")
    }

    override fun eat(){
        println("Cat is mewing")
    }
}