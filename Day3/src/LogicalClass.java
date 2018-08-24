import java.util.Arrays;

public class LogicalClass {

	public static void allocate(int arr[],int floor, int unit) {
		int index= (floor-1)*5 + unit;
		if(arr[index-1]>3) {
			System.out.println("This unit is full");
		}else {
			arr[index-1]+=1;
		}
	}
	public static void viewStatus(int arr[]){
		for(int i=4;i>=0;i--) {
			System.out.print(" \n [ ");
			for(int j=0;j<5;j++) {
				System.out.print(arr[i*5+j]);
			}
		System.out.print(" ] ");
		}
		System.out.print(" \n ");
		//System.out.println(Arrays.toString(arr));
	}
	
	public static void deallocate(int arr[], int floor, int unit) {
		int index  = (floor-1)*5 + unit;
		if(arr[index-1]==0) {
			System.out.println("This condo has no customers");
		}else {
			arr[index-1]-=1;
		}
	}
	
}
