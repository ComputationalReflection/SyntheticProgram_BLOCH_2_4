package es.uniovi.reflection.bloch_2_4.compliant;

class A1 {
 private static class A1_I {
		static int b;
        String strVar;
	}

    protected static class A1_II {
		static class A1_II_I {
			public static void a1_method () {  
				System.out.println("A1");
			}
            public void a1_method (String strVar) {
                System.out.println("A1");
		    }
	    }
    }

    public static class A1_III {
        private static void a1_method () {
            System.out.println("A1_III");
        }

        private A1_III(){}
    }

    static class A1_IV {
        protected static void a1_method () {
            System.out.println("A1_IV");
        }

        private A1_IV(){}
    }

    static class A1_V {
        static void a1_method () {
            System.out.println("A1_V");
        }

        private A1_V(){}
    }

    public void containsLocalClassMethod(){
        class LocalClass {
            static final int INT_VAR = 1;
        }
    }

    public void containsAnonymousClassMethod(){
        ExplicitStaticFieldInterface r = new ExplicitStaticFieldInterface() {
            static final int INT_VAR = 1;
        };
    }
}
