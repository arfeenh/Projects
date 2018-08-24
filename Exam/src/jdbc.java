
import java.sql.*;

public class jdbc {

	public static Connection con=null;
	public static Statement st = null;
	public static int rs;
	public static ResultSet rs1=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uname = "system";
		String pwd= "tcs12345";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("register the driver");

		con = DriverManager.getConnection(url, uname, pwd);
		
		System.out.println("connection established");
		
		return con;
		
	}
	
	public static ResultSet insert(String query) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement(query);
		


		System.out.println(rs);
		//rs1.close();
		st.close();
		con.close();
		
		System.out.println("all connection closed");
		return rs1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
