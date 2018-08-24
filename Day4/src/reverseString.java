import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input string to reverse");
		
		String str = sc.nextLine();
		String strReversed="";
		
		for(int i=str.length()-1;i>=0;i--) {
			strReversed+=str.charAt(i);
		}
		System.out.print(strReversed);
	}


}
