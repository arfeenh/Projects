import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;


public class InsuranceLogic {

	Scanner sc = new Scanner(System.in);

	private static ArrayList<InsurancePolicy> policy  = new ArrayList<InsurancePolicy>();
	private static ArrayList<InsuranceUsers> customers  = new ArrayList<InsuranceUsers>();

	public static Connection con=null;
	public static Statement st = null;
	public static int rs;
	public static ResultSet rs1=null;

	int option= 0;
	String policyId = "";
	String policyName = "";
	int policyDuration=-1;
	int modeOfPayment=-1;
	String nominee="";
	double comittedAmmount=-1;
	int status=-1;
	String polid;
	
	
	
	public ArrayList <InsurancePolicy> addModifyPolicy(ArrayList <InsurancePolicy> Arr) throws SQLException, ClassNotFoundException {
		int duration = -1;

		System.out.println("Thank you for authenticating you are now in create a policy method\r\n"
				+ "1: Create a new policy \r\n"
				+ "2: Modify existing policy \r\n"
				+ "3: exit to main menu \r\n");

		int option=sc.nextInt();
		switch(option) {

		case 1: 
			while(!policyId.matches("^[a-zA-Z0-9]{5,10}$")) {
				System.out.println("Please input Policy Id: ");
				policyId = sc.next();
			}
			while(!policyName.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input Policy Name: ");
				policyName = sc.next();
			}
			while(policyDuration<0) {
				try {
					System.out.println("Please input policy duration");
					policyDuration = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}			
			while(modeOfPayment>0 && modeOfPayment<=4) {
				try {
					System.out.println("Please input mode Of Payment");
					modeOfPayment = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}
			while(!nominee.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input nominee: ");
				nominee = sc.next();
			}
			while(comittedAmmount>0) {
				try {
					System.out.println("Please input comitted Ammount");
					comittedAmmount = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}
			while(status>0 && status<=2) {
				try {
					System.out.println("Please input status\r\n"
							+ "1: Active \r\n"
							+ "2: Inactive\r\n");
					status = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}

			InsurancePolicy al = new InsurancePolicy(policyId,policyName,policyDuration,modeOfPayment,nominee,comittedAmmount,status);
			
			con=jdbc.getConnection();   ////sending data to sql database
			
			String query = "insert into policy values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,policyId);
			ps.setString(2, policyName);
			ps.setInt(3, duration);
			ps.setInt(4, modeOfPayment);
			ps.setString(5, nominee);
			ps.setFloat(6, (float) comittedAmmount);
			ps.setInt(7, status);
			ps.setString(8, "hrlll");
			
			ps.executeUpdate();
			
			Arr.add(al);	
			return Arr;

		case 2: 

			System.out.println("Please input policy ID to modify");
			polid=sc.next();

			String name = "";

			for(InsurancePolicy i:Arr) {
				if(i.getPolicyID().equals(polid)) {

					while(!name.matches("^[a-zA-Z0-9]{5,25}$")) {
						System.out.println("please input new policy name");
						name = sc.next();
					}
					System.out.println("Please input policy duration");
					while(duration<0) {
						try {
							System.out.println("Please input policy duration");
							duration = sc.nextInt();
						}catch(Exception e) {
							sc.nextLine();
						}
					}
					
					i.setPolicyName(name);
					i.setPolicyDuration(duration);

					System.out.println("The account name is:" + i.getPolicyName());
					break;
				}				
			}
			break;
		}
		return Arr;
	}
	
	public ArrayList <InsuranceUsers> addModifyUser(ArrayList <InsuranceUsers> Arr) throws SQLException, ClassNotFoundException{
		String name = "";
		String address = "";
		String idProof = "";
		String date = "";
		String policyId = "";
		int contactNumber=-1;
		
		System.out.println("Thank you for authenticating you are now in create/ modify a user method\r\n"
				+ "1: Create a new user \r\n"
				+ "2: Modify existing user \r\n"
				+ "3: exit to main menu \r\n");
		
		
		int option=sc.nextInt();
		switch(option) {
		case 1:
			while(!name.matches("^[a-zA-Z0-9]{5,10}$")) {
				System.out.println("Please input User Name: ");
				name = sc.next();
			}
			while(!address.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input users address: ");
				address = sc.next();
			}
			while(!idProof.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input id proof: ");
				idProof = sc.next();
			}
			while(!date.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input the date: ");
				date = sc.next();
			}
			while(!policyId.matches("^[a-zA-Z0-9]{5,25}$")) {
				System.out.println("Please input the date: ");
				policyId = sc.next();
			}
			while(contactNumber<0) {
				try {
					System.out.println("Please input the contact Number");
					contactNumber = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}
			
			InsuranceUsers al = new InsuranceUsers(name,address,idProof, date, policyId, contactNumber);

			
			con=jdbc.getConnection();
			
			String query = "insert into customer_1559835 values(?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,name);
			ps.setString(2, address);
			ps.setString(3, idProof);
			ps.setString(4, date);
			ps.setInt(5, contactNumber);
			ps.setInt(6, 0 );
			ps.setString(7, policyId);
			ps.setString(8, null);
			
			ps.executeUpdate();
			
			Arr.add(al);
			
			return Arr;
		case 2: 
			break;
		case 3:
			break;
			
		}
		return Arr;
	}
	
	public void TagUser() throws POLICYNOTFOUNDEXCEPTION {
		String policyId="";
		String Cid="";
		
		while(!policyId.matches("^[a-zA-Z0-9]{5,10}$")) {
			System.out.println("Please input policy id to search: ");
			policyId = sc.next();
		}
		
		while(!Cid.matches("^[a-zA-Z0-9]{5,10}$")) {
			System.out.println("Please input Cus Id to search: ");
			Cid = sc.next();
		}
		
		InsurancePolicy p=null;
		InsuranceUsers  u=null;
		
		for(InsurancePolicy i:policy) {
			if(i.getPolicyID().equals(policyId)) {
				p=i;
			}
		}
		
		for(InsuranceUsers j:customers) {
			if(j.getCusID().equals(Cid)) {
				u=j;
			}
		}
		
		if(p==null) {
			throw new POLICYNOTFOUNDEXCEPTION();
		}
		else if(u==null) {
			throw new POLICYNOTFOUNDEXCEPTION();
		}
		else {
			customers.add(u);
			policy.add(p);
			System.out.println("Successfully tagged");
		}
		
	}
	
	public void SearchUser(ArrayList <InsurancePolicy> arrPol, ArrayList <InsuranceUsers> arrUser) {
		System.out.println("Please input whether you would like to search by User id or policy name \r\n"
				+ "1: by User ID \r\n"
				+ "2: by Policy name \r\n+"
				+ "3: show all \r\n"
				+ "4: exit \r\n");
		int option = sc.nextInt();
		String name = "";
		String policyId= "";
		switch(option) {
		case 1:
			while(!name.matches("^[a-zA-Z0-9]{5,10}$")) {
				System.out.println("Please input User Name to search: ");
				name = sc.next();
			}	
			
			for(InsuranceUsers i:arrUser) {
				if(i.getName().equals(name)) {
					System.out.println(i.toString());					
				}
			}
			break;
			
		case 2:
			while(!policyId.matches("^[a-zA-Z0-9]{5,10}$")) {
				System.out.println("Please input Policy Id to search: ");
				policyId = sc.next();
			}
			for(InsurancePolicy i:arrPol) {
				if(i.getPolicyID().equals(name)) {
					System.out.println(i.toString());
				}
			}
			
		}
		
	}

}
