fun main(Args: Array<String>){
    var stob = Students22("Kamakazi"); // MY name form PRIMARY PARAMETER : Kamakazi

    // EXPERIMENT 1
    var stob1 = Students22("Eminem", 500)
    println("ID FROM SECONDARY PARAMETER : ${stob1.id}")
    /*
        * O/P
        * MY name form PRIMARY PARAMETER : Eminem --triggered by PRIMARY Const
        * ID FROM SECONDARY PARAMETER : 500 --triggered by Secondary Const
    */

    // EXPERIMENT 2 [PUTTING ID inside init]
    var stob12 = Students22("Enrique", 500) // Because ID is not initialised so it took DEFAAULT
    /*
        * MY name form PRIMARY PARAMETER : Enrique --> ID : -1
    */
}


// PROPERTY inside the PRIMARY CONSTRUCTOR
class Students22(var _name: String){

    //FOR SECONDARY CONST
    var id:Int = -1

    init {
        println("MY name form PRIMARY PARAMETER : ${_name} --> ID : ${id}") //MY name iss : JP
    }

    // Secondary Constructor
    // constructor(n:String, VAR id:Int):this(n){ USING VAR or VAL IS INCORRECT::SIMPLY DEFINE EXTRA PROPERTY ON TOP
    // CALLING PRIMARY CONST is mandatory [this(n)]
    constructor(n:String, id:Int):this(n){

        // from EXPERIMENT 2 :: The body of SECONDARY Const is called AFTER the PRIMARY Const's INIT block
        this.id = id
    }
}
