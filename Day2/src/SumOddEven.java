import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter min value");
		int min = sc.nextInt();
		
		System.out.println("Please enter max value");
		int max = sc.nextInt();
		
		int evensum=0;
		int oddsum=0;
		for(int i=min;i<=max;i++) {
			if(i%2==1) {//odd case
				oddsum=oddsum+i;
			}else {
				evensum=evensum+i;
			}
		}
		System.out.println("Odd sum: ");
		System.out.println(oddsum);
		System.out.println("Even sum: ");
		System.out.println(evensum);
	}

}
