fun main(Args: Array<String>){
    // calling general class
    var ob = Student()
    var hol = ob.hasPassed(4)
    println("is the student sucked : ${hol}")

    println("is the bitch scholar : ${ob.isScholar(120)}")
}

// Method Extension :: not correct
fun Student.isScholar(marks: Int):Boolean {
    return marks >= 95
}

class Student{
    fun hasPassed(marks: Int):Boolean {
        return marks >35
    }
}