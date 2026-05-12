package es.uniovi.reflection.bloch_2_4.not_covered;

import es.uniovi.reflection.bloch_2_4.compliant.WithNotStaticMethodsClass;

//Every class inherits methods from Object, so the scenario is tricky
//public class InheritedNotStaticMethodsFromAnotherClass extends WithNotStaticMethodsClass {
//	static int b;
//
//	public static void a2_method () {
//		System.out.println(b);
//	}
//}
public class InheritedNotStaticMethodsFromAnotherClass {
	//Java generates a private constructor by default, We could check that the constructor is empty or is not throwing exceptions, as Bloch states.
	//Also, Maybe progquery could be improved to mark these constructors as isUserCode : false, but I tried and it was hard
	private static class A1_I {
		static int b;
		static String strVar;
	}

}
