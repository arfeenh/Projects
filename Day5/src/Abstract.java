
public abstract class Abstract {
	static int i =100;
	int j = 200;
	
	public void method1() {
		System.out.println("Method 1");
	}
	
	public static void method2() {
		System.out.println("Method 2");

	}
	
	public abstract void method3() ;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstact obj1 = new Abstact();
		Abstract.method2();
		

	}
}
