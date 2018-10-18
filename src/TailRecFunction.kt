import java.math.BigInteger

/*
*
* Uses Recursion in Optimised :: WITHOUT USING STACK MEMORY
*
* */

fun main(args: Array<String>){
    // println(getFibbonacci(10000, BigInteger("1"), BigInteger("0"))) // throws Stack OverFlow Error
    println(getFibbonacci1(10000, BigInteger("1"), BigInteger("0"))) // This case KOTLIN overtakes JAVA
}

// General Recursion
fun getFibbonacci(n:Int, a: BigInteger, b:BigInteger) : BigInteger {
    if (n == 0)
        return b
    else
        return getFibbonacci(n-1, a+b, a)
}

// TailRec Recursion
tailrec fun getFibbonacci1(n:Int, a: BigInteger, b:BigInteger) : BigInteger {
    if (n == 0)
        return b
    else
        return getFibbonacci1(n-1, a+b, a)
}