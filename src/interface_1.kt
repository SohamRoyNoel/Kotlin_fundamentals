fun main(args: Array<String>){
    val pg = Program()
    pg.addTwoNumbers(10,20)

    pg.addTwoNmbers(10,25, object : MyInterfaces {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
}

class Program {
    //Implementation of INTERFACE - OOP Way
    fun addTwoNmbers(a:Int, b:Int, action: MyInterfaces){
        val sum = a+b
        action.execute(sum)

    }

    fun addTwoNumbers(a:Int, b: Int){
        val sum = a + b
        println(sum)
    }
}

interface MyInterfaces{
    fun execute(sum: Int)
}