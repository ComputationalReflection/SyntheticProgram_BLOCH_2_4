package es.uniovi.reflection.bloch_2_4.compliant;

public class WithNotStaticMethodsClass {
    public void publicMethod () {
        System.out.println("hello");
    }
    private void privateMethod () {
        System.out.println("hello");
    }
    protected void protectedMethod () {
        System.out.println("hello");
    }
    void defaultMethod () {
        System.out.println("hello");
    }
}

