/*
 *  There are four visibility modifiers in Kotlin: private, protected, internal and public.
 *  The default visibility, used if there is no explicit modifier, is public.
 *
 *  If you do not specify any visibility modifier, public is used by default,
    which means that your declarations will be visible everywhere;
 *  If you mark a declaration private, it will only be visible inside the file containing the declaration;
 *  If you mark it internal, it is visible everywhere in the same module;
 *  protected is not available for top-level declarations.
 *
 *  Classes and Interfaces ------------->
    For members declared inside a class:

 *   private means visible inside this class only (including all its members);
 *   protected — same as private + visible in subclasses too;
 *   internal — any client inside this module who sees the declaring class sees its internal members;
 *   public — any client who sees the declaring class sees its public members.
 *
 *   NOTE for Java users: outer class does not see private members of its inner classes in Kotlin.

 *   If you override a protected member and do not specify the visibility explicitly,
 *   the overriding member will also have protected visibility.
 */

class publicClass{

}

private class privateClass{

}

internal class onlyKotlin {

}

// class inside
open class Person{
    private val a = 1
    protected val b = 1
    internal val c = 1
    val d = 1
}

// case 1
class Indian : Person(){
    fun test(){
        println(d);
        // println(a); //err
        println(c)
        println(b)
    }
}
// case 2
class Europian {
    fun test(){
        var persons = Person()
        println(persons.d)
        println(persons.c)
        // println(persons.b) // Err
        // println(persons.a) // Err
    }
}
