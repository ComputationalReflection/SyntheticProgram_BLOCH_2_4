package es.uniovi.reflection.bloch_2_4.noncompliant;

public interface NestedClassInsideInterface{
    void method();

    class NestedClass {
        public static int b;

        public static void staticMethod () {
            System.out.println(b);
        }
    }
}
