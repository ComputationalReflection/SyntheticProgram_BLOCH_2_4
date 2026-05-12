package es.uniovi.reflection.bloch_2_4.noncompliant;

class A1 {
	static class A1_I {
		static int b;
	}

	protected static class A1_II {
		static class A1_II_I {
			public static void a1_method () {  
				System.out.println("A1");       
			}
		}
	}

    public static class A1_III {
        private static void a1_method () {
            System.out.println("A1_III");
        }

        protected A1_III(){}
    }

    static class A1_IV {
        protected static void a1_method () {
            System.out.println("A1_IV");
        }

        A1_IV(){}
    }

    static class A1_V {
        static void a1_method () {
            System.out.println("A1_V");
        }

        public A1_V(){}
    }
}
