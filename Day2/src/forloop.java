import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input min value");
		int min=sc.nextInt();
		
		System.out.println("Please input max value");
		int max=sc.nextInt();
		
		System.out.print("The following numbers are divisible by 3 and 7: ");
		for(int i=min;i<=max;i++) {
			if(i%3==0 && i%7==0) {
				if(i!=0) {
					System.out.println(i);
				}
			}
		}
	}

}
