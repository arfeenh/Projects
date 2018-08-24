import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayLogical {

	Scanner sc= new Scanner(System.in);
	
	public static double [] createArray(int size) {
		double [] Array = new double[size];		
		return Array;
	}
	public static void addElements(double [] arr, int index, double value) {
		arr[index]=value;
	}
	public double[] smallestLargest(double[] arr) {
		
		Arrays.sort(arr);
		
		double [] smallLarge= {arr[0],arr[arr.length-1]};
		return smallLarge;
	}
	public double avg(double [] arr) {
		double num=0;
		double result=0;
		for(int i=0;i<arr.length;i++) {
			num+=arr[i];
		}
		result=num/arr.length;
		return result;
	}
	public static void duplicate(double [] arr) {
		int flag=0;
		Arrays.sort(arr);
		System.out.print("The duplicates are: ");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				flag=1;
				continue;
			}
			
			if(flag==1) {
				if(arr[i]!=arr[i+1]) {
					System.out.print(" ");
					System.out.print(arr[i]);
					flag=0;
				}
			}
		}
		if(flag==1) {
			System.out.print(" ");
			System.out.println(arr[arr.length-1]);
		}
		System.out.println("");
	}
	
	public static void showDuplicate(double [] arr) {
		int flag=0;
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				flag=1;
				
			}
			if(flag==1) {
				count++;
				if(arr[i]!=arr[i+1]) {
					System.out.print("Duplicates for: ");
					System.out.print(arr[i]);
					System.out.printf(" are: %d -- ", count);
					count=0;
					flag=0;
				}
			}
		}
		if(flag==1) {
			count++;
			System.out.print("Duplicates for: ");
			System.out.print(arr[arr.length-1]);
			System.out.printf(" are %d ", count);
		}
	}
	public static void reverse(double [] arr) {
		System.out.println(" ");
		System.out.println("The original array is: ");
		System.out.print(Arrays.toString(arr));
		System.out.println(" ");
		System.out.println("The reverse array is:");
		System.out.print("[");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		System.out.print("] \n");
	}
	public static void secondLS(double [] arr) {
		
		double secSmallest=0;
		double secLargest=0;
		System.out.println(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[i+1]) {
				secSmallest=arr[i+1];
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=arr[i-1]) {
				secLargest=arr[i-1];
				break;
			}
		}
		System.out.printf("The second smallest value is: %f \n",secSmallest);
		System.out.printf("The second largest value is: %f \n",secLargest);
	}
	
	public static void common(double [] arr) {
		Scanner sc= new Scanner(System.in);

		System.out.println("please input size of comparison array?");
		int size=sc.nextInt();
		
		double [] cArr =createArray(size);
		
		double value=0;
		for(int i=0;i<cArr.length;i++) { //add array element
			System.out.printf("Please input %d element", i+1);
			value = sc.nextDouble();
			addElements(cArr, i, value);
		}	
		for(int i=0;i<cArr.length;i++) {
			int key=Arrays.binarySearch(arr, cArr[i]);
			if(key>=0) {
				System.out.print("Common values are: ");
				System.out.println(cArr[i]);
			}
		
		}
	}
}
