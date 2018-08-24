import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter number for which multiplication table is needed");
		double table = sc.nextInt();
		System.out.println("The table is: ");
		for(double i=0; i<=10; i++) {
			System.out.println(table*i);
		}
	}

}
