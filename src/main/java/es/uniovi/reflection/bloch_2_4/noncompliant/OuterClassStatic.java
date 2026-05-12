package es.uniovi.reflection.bloch_2_4.noncompliant;

public abstract class OuterClassStatic {
    abstract void method();

    static class StaticNestedClass {
        public static int b;

        public static void staticMethod () {
            System.out.println(b);
        }
    }
}
