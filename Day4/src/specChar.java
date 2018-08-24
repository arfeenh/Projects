import java.util.Arrays;
import java.util.Scanner;

public class specChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input string");
		
		String [] arr = sc.nextLine().split(" ");
		
		
		System.out.println(Arrays.toString(arr));		
		Arrays.sort(arr);
		System.out.println("please input the key");
		String key=sc.next();
		boolean keyT = false;
		int a=0;
		for(int i=0;i<arr.length;i++) {
			keyT = arr[i].contains(key);
			
			if(keyT==true) {
				System.out.println(arr[i]);
			}
		}
	}

}
