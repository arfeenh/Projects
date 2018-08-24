import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input whole number");
		int num = sc.nextInt();
		
		System.out.println("Please input min number");
		int min = sc.nextInt();
		
		System.out.println("Please input max number");
		int max = sc.nextInt();
		System.out.print("num\t ");
		System.out.print(">\t\t ");
		System.out.print("<\t\t ");
		System.out.print("==\t\t ");
		System.out.print(">=\t\t ");
		System.out.print("<=\t\t ");
		System.out.print("!=\t\t ");

		
		for(int i=min, j=0;i<max;i++,j++) {
			System.out.println();
			System.out.printf("%d\t",i);
			if(i*num%7==0 && i*num%3==0) {
				for(int k=0;k<6;k++) {
					System.out.print("fizzbuzz\t");;
				}
			}
			else if (i*num %7==0) {
				for(int k=0;k<6;k++) {
					System.out.print("buzz\t\t");
				}
			}
			else if (i*num %3==0) {
				for(int k=0;k<6;k++) {
					System.out.print("fizz\t\t");
				}
			}
			else {
				System.out.printf("%b \t\t ", num>i);
				System.out.printf("%b \t\t ", num<i);
				System.out.printf("%b \t\t ", num==i);
				System.out.printf("%b \t\t ", num>=i);
				System.out.printf("%b \t\t ", num<=i);
				System.out.printf("%b \t\t ", num!=i);
			}
			
		}
	}

}
