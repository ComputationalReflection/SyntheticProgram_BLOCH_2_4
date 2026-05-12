package es.uniovi.reflection.bloch_2_4.noncompliant;

public class StaticTwoConstructors {

    private static int a;

    public static void util1(Integer another){
        if(a > another)
            a = another;
    }

    public static int accum(){
        return a;
    }

    private StaticTwoConstructors(){
    }

    public StaticTwoConstructors(int a){
        StaticTwoConstructors.a = a;
    }
}
