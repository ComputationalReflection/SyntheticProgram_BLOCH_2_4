package es.uniovi.reflection.bloch_2_4.compliant;

public abstract class OuterClassStatic {
    abstract void method();

    static class StaticNestedClass {
        public static int b;

        private StaticNestedClass(int intVar){
            b=6;
        }

        public static void staticMethod () {
            System.out.println(b);
        }
    }
}
