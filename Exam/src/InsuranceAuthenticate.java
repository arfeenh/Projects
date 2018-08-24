
public class InsuranceAuthenticate {

	static String policyadminUser = "Admin";
	static String UseradminUser = "Admin";
	static String policyadmin = "Hello";
	static String Useradmin = "Hello";
	
	public static boolean authPolicyAdmin(String username, String password) {
		
		if(policyadmin.equals(password)&& policyadminUser.equals(username)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean authUserAdmin(String username, String password) {
		
		if(Useradmin.equals(password)&&UseradminUser.equals(username)) {
			return true;
		}
		else {
			return false;
		}
	}
}
