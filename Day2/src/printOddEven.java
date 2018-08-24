import java.util.Scanner;

public class printOddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input an odd number");
		
		int oddNum= sc.nextInt();
		
		System.out.print(1);
		System.out.print(" ");

		for(int i=2;i<=oddNum;i++) {
			if(i%2==1) { //odd
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i-1);
				System.out.print(" ");
			}
		}
	}
}
