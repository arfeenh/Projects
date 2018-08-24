public class LogicalClass2D {

	public static void allocate(int arr[][],int floor, int unit) {
		//int index= (floor-1) + unit;
		if(arr[floor-1][unit-1]>3) {
			System.out.println("This unit is full");
		}else {
			arr[floor-1][unit-1]+=1;
		}
	}
	public static void viewStatus(int arr[][]){
		for(int i=4;i>=0;i--) {
			System.out.print(" \n [ ");
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]);
			}
		System.out.print(" ] ");
		}
		System.out.print(" \n ");
		//System.out.println(Arrays.toString(arr));
	}
	
	public static void deallocate(int arr[][], int floor, int unit) {
		int index  = (floor-1) + unit;
		if(arr[floor-1][unit-1]==0) {
			System.out.println("This condo has no customers");
		}else {
			arr[floor-1][unit-1]-=1;
		}
	}
	
}
