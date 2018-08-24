import java.util.Scanner;

public class IsEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter 1st number to compare");
		int firstNum= sc.nextInt();
		
		System.out.println("Please enter 2nd number to compare");
		int secondNum = sc.nextInt();
		
		
		boolean comparison = Integer.toString(firstNum).equals(Integer.toString(secondNum));
		System.out.println(comparison);
	}

}
