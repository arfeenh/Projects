import java.util.Scanner;

public class BooleanOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Please input your feedback on any of our products");
		
		int feedback = sc.nextInt();
		
		
		if(feedback==10) {
			System.out.println("Thanks for the positive feedback");
		}
		else if(isBetween(feedback,5,9)) {
			System.out.println("Thanks for your feedback, we will be improving our new product in the coming days before we launch to the public");
		}
		else if(isBetween(feedback,1,4)) {
			System.out.println("Please send us an email with your detailed feedback so we can improve our product");
		}
		else if(feedback==0) {
			System.out.println("Sorry to hear you didn't like our product.");
		}
	}
	
	public static boolean isBetween(int x, int lower,int upper) {
		return lower <= x && x<=upper;
	}

}
