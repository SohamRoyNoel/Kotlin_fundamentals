fun main(Args: Array<String>){
    val str1:String = "sexy "
    val str2:String = "bitch"

    val str3:String = "Hey "

    // Since KOTLIN has no primitive datatype; all are considered as OBJECT
    // So, its done by using "str3" as OBJECT
    println(str3.addThree(str1, str2))
}

fun String.addThree(s1:String, s2:String) : String {
    return this + s1 + s2
}