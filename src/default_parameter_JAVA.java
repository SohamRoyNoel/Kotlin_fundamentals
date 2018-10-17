public class default_parameter_JAVA {

    public static void main(String[] args) {
        // int vols = Default_parameter_KOTLINKt.vol(10,15); // as java doesnt have DEFAULT PARAMETER CONCEPT
        // issue solved by @JvmOverloads on KT file

        int vols = Default_parameter_KOTLINKt.vol(10,15);
        System.out.println("Area from java : " + vols);
    }

}
