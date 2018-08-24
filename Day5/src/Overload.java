
public class Overload {

	
	public double testOverload(int a, int b) {
		
		return (a+b);
		
	}
	
	public double testOverload(String a, String b) {
		return (a.length()+b.length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ob1 = new Overload();
		
		System.out.println(ob1.testOverload(1, 4));
		System.out.println(ob1.testOverload("abcd", "KMKJNDJWD"));

		
	}

}
