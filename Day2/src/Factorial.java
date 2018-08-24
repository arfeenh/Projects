import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number for which factorial is needed");
		double fact = sc.nextDouble();
		
		double num=1;
		double denom=fact;
		for(double i=fact;i>=1;i--) {
			num = num*i;

		}
		
		System.out.println("The factorial is: ");
		System.out.println(num/denom);
		
		
	}

}
