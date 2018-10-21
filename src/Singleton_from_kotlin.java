public class Singleton_from_kotlin {
    public static void main(String[] args) {
        System.out.println(MyClasses.companionMethod("Called from java"));

        MyClasses ob = new MyClasses();
        System.out.println(ob.outsideCompanionObject("called from java"));
    }
}
/*
        called from COMPANION METHOD : Called from java
        called from outside of COMPANION METHOD : called from java
*/
