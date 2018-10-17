//You can put KOTLIN method in a wrapper like -> change the corresponding method in JAVA file
@file:JvmName("DishaniIsLovely")

fun main(args: Array<String>){
    var addition = interoperability_JAVA.addKotliner(15,15)
    println("Addition from KOTLIN : ${addition}")
}

fun add(a:Int, b:Int):Int {
    return a+b
}