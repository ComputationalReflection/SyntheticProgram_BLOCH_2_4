package es.uniovi.reflection.bloch_2_4.compliant;

public abstract class OuterClass {
    abstract void method();

    class NonStaticNestedClass {
        public static int b;

        public NonStaticNestedClass(int intVar){
            b=6;
            OuterClass.this.method();
        }

        public static void staticMethod () {
            System.out.println(b);
        }
    }
}
