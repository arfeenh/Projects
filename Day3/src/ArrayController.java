import java.util.Arrays;
import java.util.Scanner;

public class ArrayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of values you want to enter in your array");
		int size=sc.nextInt();
		
		ArrayLogical obj = new ArrayLogical();
		
		double [] Arr = obj.createArray(size);
		
		double value=0;
		for(int i=0;i<Arr.length;i++) { //add array element
			System.out.printf("Please input %d element", i+1);
			value = sc.nextDouble();
			obj.addElements(Arr, i, value);
		}	
		double [] Arr2=Arr;
		
		while(exit==0) {
			System.out.println("please choose one of the below operations:"
					+ "\r\n" + 
					"1: Find the smallest and largest value\r\n" + 
					"2: Find the average\r\n" + 
					"3: Identify the duplicate elements\r\n" + 
					"4: Show the elements and number of times they are repeated\r\n" + 
					"5: Print elements of array in reverse\r\n" + 
					"6: Find second largest and second smallest value\r\n" + 
					"7: Finding the common elements comparing with older array to new array (create new array and do comparison)\r\n" + 
					"8: Exit");
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				double [] smallestLargest = obj.smallestLargest(Arr);
				System.out.println(Arrays.toString(smallestLargest));
				break;
			case 2: 
				double avg = obj.avg(Arr);  //average
				System.out.println(avg);
				break;
			case 3:
				obj.duplicate(Arr); //identify and print duplicate
				break;
			case 4:
				obj.showDuplicate(Arr);
				break;
			case 5:
				ArrayLogical.reverse(Arr2);
				break;
			case 6:
				ArrayLogical.secondLS(Arr);
				break;
			case 7:
				ArrayLogical.common(Arr);
				break;
			case 8: 
				exit=1;
				break;
			}
		}
	}
}
