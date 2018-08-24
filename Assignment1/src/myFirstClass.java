
public class myFirstClass {
	int a=1;
	double b=2.5;
	static String c="Hello";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFirstClass obj = new myFirstClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(c);
		obj.m1();
		obj.m2();
	}
	
	public void m1(){
		int i=600;
		System.out.println("Method m1:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void m2(){
		int i=500;
		System.out.println("Method m2:");
		System.out.println(i);
	}
}
