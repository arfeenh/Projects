
public class child extends Abstract {

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");
	}
	
	public static void main(String [] args) {
		Abstract obj2 = new child();   

		System.out.println("i: "+  i);
		System.out.println("j: " + obj2.j);
		obj2.method1();
		method2();
		obj2.method3();

		child obj3 = new child();
		
		System.out.println("i: "+  i);
		System.out.println("j: " + obj3.j);
		obj3.method1();
		method2();
		obj3.method3();
	}

}
