package es.uniovi.reflection.bloch_2_4.noncompliant;

public class WithPrivateStaticMethodsClass {
    private static int intVar;
    private static String StringVar;

    private static void privateStaticMethod1 () {
        System.out.println("hello");
    }
    private static void privateStaticMethod2 () {
        System.out.println("hello");
    }
}
