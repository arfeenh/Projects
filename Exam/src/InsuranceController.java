import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class InsuranceController {
	
	public static void main(String[] args) throws POLICYNOTFOUNDEXCEPTION, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int exit=0;
		Scanner sc = new Scanner(System.in);
		
		InsuranceAuthenticate auth = new InsuranceAuthenticate();
		InsuranceLogic logic = new InsuranceLogic();
		
		String policyAdminUser;
		String policyAdminPass;
		String UserAdmin;
		String userAdminPass;
		
		ArrayList <InsurancePolicy> Arr;
		
		Arr = new ArrayList<InsurancePolicy>();
		
		
		ArrayList <InsuranceUsers> ArrUser;
		
		ArrUser = new ArrayList<InsuranceUsers>();
		
		while(exit==0) {
			System.out.println("Please select from below options: \r\n"
					+ "1: Login as policy admin: \r\n"
					+ "2: Login as user admin: \r\n"
					+ "3: Change customer details: \r\n"
					+ "4: Tag user \r\n"
					+ "5: Exit \r\n");
			
			int option = sc.nextInt();
			
			switch(option) {
			case 1: 

				System.out.println("Please input your username");
				policyAdminUser=sc.next();
				System.out.println("Please input your password");
				policyAdminPass = sc.next();
				if(InsuranceAuthenticate.authPolicyAdmin(policyAdminUser,policyAdminPass)) {
					Arr = logic.addModifyPolicy(Arr);
					System.out.println(Arr);
				}else{
					System.out.println("wrong user name or pass");
				}
				
				break;
				
			case 2: 
				System.out.println("Please input your username");
				UserAdmin=sc.next();
				System.out.println("Please input your password");
				userAdminPass = sc.next();
				if(InsuranceAuthenticate.authUserAdmin(UserAdmin, userAdminPass)) {
					ArrUser = logic.addModifyUser(ArrUser);
					System.out.println(Arr);
				}else{
					System.out.println("wrong username or pass");
				}
				break;
			case 3:
				
				break;
			case 4:
				logic.TagUser();
				break;
			case 5:
				exit=1;
				break;
				
			}
			
			
		}
	
	}

}
