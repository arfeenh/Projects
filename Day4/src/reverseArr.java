import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Please enter a string");
		
		
		String [] arr = sc.nextLine().split(" ");
		
		String [] reversed = new String[arr.length];
		
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			reversed[j]=arr[i];
		}
		System.out.println(Arrays.toString(reversed));
		
		StringBuilder builder = new StringBuilder();
		for(String s:reversed) {
			builder.append(s);
			builder.append(" ");
		}
		String str = builder.toString();
		
		System.out.println(str);
	}
	

	
	public static String reverse(String str) {
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}

}
