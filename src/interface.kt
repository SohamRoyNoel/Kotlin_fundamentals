fun main(args: Array<String>){
    // Interface cant be instantiated
    // var if = MyInterface() // err

    var realClass = clickMe()
    realClass.onClick()
    realClass.abstractEx()
}

interface MyInterface {
    var name:String  // Properties in INTERFACE are default ABSTRACT & OPEN as well

    fun abstractEx()  // METHODS in interface are abstract by default

    fun onClick(){  // Normal methods are PUBLIC but NOT FINAL
        // - this is not ABSTRACT - FOR HAVING BODY
        println("Button Clicked inside INTERFACE")
    }
}

interface MySecondInterface {

    // same METHOD NAME but this one is NORMAL function
    fun abstractEx(){
        println("Button Clicked inside SECOND INTERFACE")
    }

    fun onClick(){
        println("Button Clicked inside SECOND INTERFACE")
    }
}

// Unlike ABSTRACT class that uses () but in case of Interface no () is needed
class clickMe : MyInterface, MySecondInterface {

    /*
            override var name: String = "Hotaru"

            // Since this method is not ABSTRACT - it doesnt need a clear OVERRIDE
            override fun onClick() {
                super.onClick()
                println("Button is touched")
            }

            override fun abstractEx() {
                println("Button is Abstract")
            }

            Button Clicked inside INTERFACE
            Button is touched
            Button is Abstract
    */

    // After commenting previous implementation now re implement them
    override var name: String = "Dishani is beautiful"

    override fun abstractEx() {
        super.abstractEx()
        println("CASE 2 : Button Clicked inside SECOND INTERFACE")
    }
    // Still ERROR has not gone
    // RULE :: while inheriting TWO INTERFACES & if two METHODS HAVE SAME NAME; ONE HAS TO BE OVERRIDDEN
    override fun onClick() {
        super<MyInterface>.onClick()
        super<MySecondInterface>.onClick()
        // super.onClick() // THROWS ERROR as compiler gets confused :: which one method to call
        println("ONClick method from CLASS")
    }
    /*
            Button Clicked inside INTERFACE
            Button Clicked inside SECOND INTERFACE
            ONClick method from CLASS
            Button Clicked inside SECOND INTERFACE
            CASE 2 : Button Clicked inside SECOND INTERFACE
    */
}

