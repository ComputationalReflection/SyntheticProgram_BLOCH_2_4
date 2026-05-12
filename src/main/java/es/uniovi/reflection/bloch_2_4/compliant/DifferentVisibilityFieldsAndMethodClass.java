package es.uniovi.reflection.bloch_2_4.compliant;

public class DifferentVisibilityFieldsAndMethodClass {
    static int b1;
    protected static int b2;
    public static int b3;
    private static final int b4 = 5;

    private DifferentVisibilityFieldsAndMethodClass(){}

	public static void publicStaticMethod () {
		System.out.println("Hello");
	}
    protected static void protectedStaticMethod () {
        System.out.println("Hello");
    }
    static void defaultStaticMethod () {
        System.out.println("Hello");
    }
    private static void privateStaticMethod () {
        System.out.println("Hello");
    }
}
