 fun main(args: Array<String>){

     var myString = "hello world";
     print(myString)

     /*
         print("Hello world")
         println("Hello world")
     */

     var number = 10
     var decimal = 1.2
     var mystring1: String //Mutable
     mystring1 = "Hello"
     println(mystring1)
     mystring1 = "Cool"
     println(mystring1)

     //Immutable
     val mystr = "this is kotlin line"
     // mystr = "100" // its an error a val is immutable
     println(mystr)

      //Length of STRING
     println("Length : ${myString.length}") //11
 }