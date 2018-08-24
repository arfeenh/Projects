import java.util.Scanner;

public class AhmedCondo {

	public static void main(String[] args) {
		int exit=0;
		Scanner sc = new Scanner(System.in);
	
		//int[] units[]=new int[5];
		
		int [][] units = new int[5][5];
		while(exit==0) {
			int option=0;
			int in=0;
	
			while (in==0) {
				System.out.println("please choose one of the below options:");
				System.out.println("1: Allocate Customer");
				System.out.println("2: view status");
				System.out.println("3: deallocate ");
				System.out.println("4: Close ");
				try {
					option = sc.nextInt();
					in=1;
				}catch(Exception e){
					System.out.println("Invalid Entry");
					sc.next();
				}
			
				in=0;
			
				switch(option){
				
				case 1: 
					System.out.println("Please input floor number");
					int floorNum=sc.nextInt();
					
					System.out.println("Please input unit number");
					int unitNum=sc.nextInt();
					
					LogicalClass2D.allocate(units, floorNum, unitNum);
					break;
					
				case 2:
					LogicalClass2D.viewStatus(units);
					break;
				case 3:
					System.out.println("Please input floor number");
					int floorNum1=sc.nextInt();
					
					System.out.println("Please input unit number");
					int unitNum1=sc.nextInt();
					
					LogicalClass2D.deallocate(units, floorNum1, unitNum1);
					break;
					
				case 4:
					System.out.println("Finished");
					exit=1;
					break;
				}
				break;
				
		
			}
		}
	}

}
