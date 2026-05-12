package es.uniovi.reflection.bloch_2_4.compliant;

public interface NestedClassInsideInterface{
    void method();

    class NestedClass {
        public static int b;

        private NestedClass(int intVar){
            b=6;
        }

        public static void staticMethod () {
            System.out.println(b);
        }
    }
}
