
import java.util.*;

public class concatName {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String FirstName = sc.next();
		
		System.out.println("Please enter your last name");
		String LastName = sc.next(); 
		
		concatName obj = new concatName();
		System.out.println(obj.concat(FirstName, LastName));
		
	}
	
	public String concat(String FirstName, String LastName) {
		String fullName = FirstName+" "+LastName;
		return fullName;
	}
	
}
