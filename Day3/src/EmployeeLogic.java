import java.util.Scanner;

public class EmployeeLogic {


	public static Employee[] createArray(int size) {
		Employee [] Arr = new Employee[size];
		
		for(int i=0;i<size;i++) {
			Arr[i]= new Employee();
		}
		return Arr;
	}
	
    public static Employee[] add(Employee Arr[]) {
    	Scanner sc = new Scanner(System.in);
    	int index=0;
    	
    	for(int i=0 ;i<Arr.length;i++) {
    		if(Arr[i]==null) {
    			index=i;
    			break;
    		}
    	}
    	for(int i=0;i<Arr.length;i++) {
    		System.out.println("please input id number to assign");
			int empID=sc.nextInt();
			
			System.out.println("Please input Name");
			String empName=sc.next();
			
			System.out.println("Please input salary");
			double empSal=sc.nextDouble();
			
			
			if(index<=Arr.length) {
				Arr[index].setEmpId(empID);
				Arr[index].setEmpName(empName);
				Arr[index].setEmpSal(empSal);
				index++;
			}else {
				System.out.println("No free space in database");
				break;
			}
    	}	
    	return Arr;
    }
    
    public static void viewEmp(Employee [] array, int id) {
    	
    	for(Employee i:array) {
    		if(i.getEmpId()==id){
    			System.out.print("The Employee ID is: ");
    			System.out.println(i.getEmpId());
    			System.out.print("The Employee Name is: ");
    			System.out.println(i.getEmpName());
    			System.out.print("The Employee Salary is $");
    			System.out.println(i.getEmpSal());
    		}
    		else {
    			System.out.printf("Employee Id: %d not found \n ", id);
    		}
    	}    
    }
    
    public static void modifyDetails(Employee [] array, int id) {
		Scanner sc = new Scanner(System.in);

    	int exit=0;
    	for(Employee i:array) {
    		if(i.getEmpId()==id){
    			while(exit==0) {
        			System.out.println("please choose one of the below operations:"
        					+ "\r\n" + 
        					"1: Modify Employee ID\r\n" + 
        					"2: Modify Employee Name\r\n" + 
        					"3: Modify Employee Salary\r\n" +   
        					"4: Exit");
        			int option=sc.nextInt();
        			
        			switch(option) {
        			case 1:
        				System.out.println("Please input new Employee id: ");
        				int newId = sc.nextInt();
        				i.setEmpId(newId);
        				break;
        			case 2: 
        				System.out.println("Please input new Employee name: ");
        				String newName = sc.next();
        				i.setEmpName(newName);
        				break;
        			case 3:
        				System.out.println("Please input new Employee salary: ");
        				double newSalary = sc.nextDouble();
        				i.setEmpSal(newSalary);
        				break;
        			case 4:
        				exit=1;
        				break;
        			}
        		}
    		}
    		else {
    			System.out.printf("Employee Id: %d not found \n ", id);
    		} 		
    	}
    }
    
    public static void remove(Employee [] Arr, int id) {
    	
    	for(Employee i:Arr) {
    		if(i.getEmpId()==id) {
    			i.setEmpId(0);
    			i.setEmpName(null);
    			i.setEmpSal(0);
    			System.out.println("Employee successfully removed");
    		}else {
    			System.out.printf("Employee Id: %d not found \n ", id);
    		}
    	}
    }
    public static void mapEmployee() {
    	
    }
}
