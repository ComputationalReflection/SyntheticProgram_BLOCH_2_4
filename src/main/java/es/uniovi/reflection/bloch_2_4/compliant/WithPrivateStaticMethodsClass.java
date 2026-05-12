package es.uniovi.reflection.bloch_2_4.compliant;

public class WithPrivateStaticMethodsClass {
    private static int intVar;
    private static String StringVar;
    private double doubleVar;

    private static void privateStaticMethod1 () {
        System.out.println("hello");
    }
    private static void privateStaticMethod2 () {
        System.out.println("hello");
    }
    private void privateStaticMethod3 () {
        System.out.println("hello");
    }

}
