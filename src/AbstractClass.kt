fun main(args: Array<String>){

    // ABSTRACT CLASSES cant ever be Instantiated
    // var px = Persons(); // err

}

// Abstract class is a PARTIAL class
abstract class Persons{ // Abstract classes are default open

    // unlike ABSTRACT METHOD, ABSTRACT PROPERTY have no value implemented
    // abstract var name:String= "implement"
    abstract var name:String

    abstract fun eat() // Abstract method has no body {}
    open fun sleep(){}
    open fun fuck(){}
}

class Indians: Persons() {
    // a class that IMPLEMENTS any ABSTRACT CLASS, have to IMPLEMENT abstract PROPERTY too
    override var name:String = "now implemented"

    override fun sleep() {
        super.sleep()
    }

    // A class that inherits abstract class HAVE TO IMPLEMENT THE BODY
    override fun eat() {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
