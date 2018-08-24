import java.util.Arrays;
import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input how many employee need to be added");
		int numEmp=sc.nextInt();
		
		Employee[] Array= EmployeeLogic.createArray(numEmp);
		Employee[] filledArray=Array;
		
		filledArray= EmployeeLogic.add(Array);
		
		int exit=0;
		while(exit==0) {
		
			System.out.println("please choose one of the below operations:"
					+ "\r\n" + 
					"1: Add employeee\r\n" + 
					"2: View Employee details\r\n" + 
					"3: Modify Employee details\r\n" + 
					"4: Remove Employee\r\n" + 
					"5: Map Employee to a project\r\n" +  
					"6: Exit");			
			
			int option = sc.nextInt();
			
			switch(option){
			
			case 1: 
				filledArray= EmployeeLogic.add(Array);
				break;
			case 2:

				System.out.println("Please enter an Employee ID");
				int tempId = sc.nextInt();
				EmployeeLogic.viewEmp(filledArray, tempId);
				break;
			case 3:
				System.out.println("Please enter an Employee ID");
				int tempId1 = sc.nextInt();
				EmployeeLogic.modifyDetails(filledArray, tempId1);
				break;
			case 4:
				System.out.println("Please enter an Employee ID");
				int tempId2 = sc.nextInt();
				EmployeeLogic.remove(filledArray, tempId2);
				break;
			case 5:
				break;
			case 6:
				exit=1;
				break;
			}
		}
		
	}
}
