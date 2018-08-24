import java.util.Arrays;
import java.util.Scanner;

public class alphaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] arr;
		
		System.out.println("Please input your string");
		
		arr = sc.nextLine().split(" ");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(aOrder(arr)));
		//System.out.println("ahmed".compareToIgnoreCase("hello"));
		
	}
	
	public static String[] aOrder(String [] arr) {
		int len=-1;
		int count=arr.length-1;
		int a=0;
		Arrays.sort(arr);
		String temp="";
		int countSpecial = 0;
		System.out.println("sorted array");

		System.out.println(Arrays.toString(arr));

/*		for(int i=0;i<arr.length-2;i++) {  //count special
			if(arr[i].matches("(.*)[^a-zA-Z0-9 ](.*)")) {
				temp=arr[i];
				arr[i]=arr[arr.length-1-countSpecial];
				arr[arr.length-1-countSpecial]=temp;
				countSpecial++;
				System.out.println(Arrays.toString(arr));
				

			}
		}System.out.println("hellp");*/

		
		for(int i=0;i<arr.length-a;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i].matches("(.*)[^a-zA-Z0-9 ](.*)")) {
					temp=arr[i];
					arr[i]=arr[count];
					arr[count]=temp;
					count--;
					a++;
				}
				if(arr[i].length()<arr[j].length()) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(arr[i].length()==arr[j].length()) {
					len= arr[i].compareToIgnoreCase(arr[j]);
					if(len<0) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
/*		for(int i=0;i<arr.length-2;i++) {  //count special
			if(arr[i].matches("(.*)[^a-zA-Z0-9 ](.*)")) {
				temp=arr[i];
				arr[i]=arr[arr.length-1-countSpecial];
				arr[arr.length-1-countSpecial]=temp;
				countSpecial++;
				System.out.println(Arrays.toString(arr));
				

			}
		}*/

		return arr;
	}
	
}

