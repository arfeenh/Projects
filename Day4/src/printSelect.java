import java.util.Arrays;
import java.util.Scanner;

public class printSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		
		//String [] arr = sc.nextLine().split(" ");
		String str = sc.nextLine();
		//System.out.println(str);
		
		System.out.println("please enter the number of chars to print");
		
		int num = sc.nextInt();
		
		int [] position = new int[num];
		char [] check = new char[num];
		String modif = "";
		
		for(int i=0;i<num;i++) {
			System.out.printf("Please input position %d", i+1);
			position[i] = sc.nextInt();
			check[i] = (str.charAt(position[i]));
			modif = modif + check[i];
		}
		System.out.println(modif);		
	}

}
