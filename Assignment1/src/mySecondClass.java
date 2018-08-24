
import java.util.*;


public class mySecondClass {

	public static void main(String[] args) {
		myFirstClass obj = new myFirstClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		mySecondClass obj1 = new mySecondClass();
		obj1.m1();
	}
	public void m1() {
		myFirstClass obj1 = new myFirstClass();
		System.out.println("Method 1 second class:");
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	}

}
