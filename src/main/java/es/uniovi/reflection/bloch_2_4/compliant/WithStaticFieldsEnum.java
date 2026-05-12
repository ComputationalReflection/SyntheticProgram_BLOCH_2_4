package es.uniovi.reflection.bloch_2_4.compliant;

public enum WithStaticFieldsEnum {
    RED,
    GREEN,
    BLUE,
    YELLOW;

    public static final String strVar = "strVar";

    public static void staticMethodEnumClass () {
        System.out.println("Hello");
    }
}
