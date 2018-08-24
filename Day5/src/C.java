	class A{
		static int i=100;
		static int j=10;
		
		static void testMethod1(){
			System.out.println("This is method 1");
		}
		
		static double mymethod(double a, double b) {
			return (a+b);
		}
		 
	}
	
	class B extends A {
		static int i=200;
		static int k=20;
		
		static void testMethod2(){
			System.out.println("This is method 2");
		}
		
		static double mymethod(double a, double b) {
			return (a*b);
		}
	}
	
	public class C extends B{
		static int i=300;
		static int k=30;
		
		static void testMethod3(){
			System.out.println("This is method 3");
		}
		
		static double mymethod(double a, double b) {
			return (a-b);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			A obj1 = new A();
			System.out.println("Obj 1 ");
			A.testMethod1();
			//obj1.testMethod3();
			System.out.printf("i: %d ", A.i);
			System.out.printf("j: %d", A.j);
			//System.out.printf("k: ",A.k);
			A.testMethod1();
			//obj1.testMethod2();
			//obj1.testMethod3();
			System.out.println("my method: " + A.mymethod(4, 2));
			
			B obj2 = new B();
			System.out.println("Obj 2 ");

			A.testMethod1();
			B.testMethod2();
			System.out.printf("i :%d ", B.i);
			System.out.printf("j :%d ", B.j);
			System.out.printf("k: ",B.k);
			B.testMethod1();
			B.testMethod2();
			//B.testMethod3();
			System.out.println("my method: " + B.mymethod(4, 2));
			
			C obj3= new C();
			System.out.println("Obj 3 ");

			C.testMethod3();
			System.out.printf("i:%d ", C.i);
			System.out.printf("j:%d ", C.j);
			System.out.printf("k:%d ",C.k);
			//System.out.printf("k:%d ",C.l);
			A.testMethod1();
			B.testMethod2();
			C.testMethod3();
			System.out.println("my method: " + C.mymethod(4, 2));
			
			A obj4 = new B();
			System.out.println("Obj 4 ");

			A.testMethod1();
			System.out.printf("i:%d ", A.i);
			System.out.printf("j:%d ", A.j);
			//System.out.printf("k: ",obj3.k);
			A.testMethod1();
			//obj4.testMethod2();
			//obj4.testMethod3();
			System.out.println("my method: " + A.mymethod(4, 2));
			
			
			A obj5 = new C();
			System.out.println("Obj 5 ");

			//obj5.testMethod3();
			System.out.printf("i:%d ", A.i);
			System.out.printf("j:%d ", A.j);
			//System.out.printf("k: ",obj5.k);
			A.testMethod1();
			//obj5.testMethod2();
			//obj5.testMethod3();
			System.out.println("my method: " + A.mymethod(4, 2));
			
			
			//B obj6= new A();
			
			B obj7 = new C();
			System.out.println("Obj 7 ");

			C.testMethod3();

			System.out.printf("i: %d ", B.i);
			System.out.printf("j:%d ", A.j);
			System.out.printf("k:%d ",B.k);
			A.testMethod1();
			B.testMethod2();
			//obj7.testMethod3();
			//obj7.testMethod3();
			System.out.println("my method: " + B.mymethod(4, 2));
			
			
			//C obj8 = new B();
			
			//C obj9 = new B();
					
					

		}
	}
	