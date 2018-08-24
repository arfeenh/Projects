package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbc {

	public static Connection con=null;
	public static Statement st = null;
	public static int rs;
	public static ResultSet rs1=null;
	public static int rs2;

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uname = "system";
		String pwd= "tcs12345";
		
		String query = "create table name2_1559835(id number PRIMARY KEY, name varchar(20))";
		String query1 = "select * from name2_1559835";
		String query2 = "insert into name2_1559835 values(1,'hamza')";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("register the driver");

		con = DriverManager.getConnection(url, uname, pwd);
		
		System.out.println("connection established");
		
		st = con.createStatement();
		System.out.println("Statement created");
		
		//rs = st.executeUpdate(query);
		rs2=st.executeUpdate(query2);
		//rs1=st.executeQuery(query1);
		System.out.println("query executed");
		
//		while(rs1.next()) {
//			System.out.print(rs1.getInt(1));
//			System.out.println("--->"+rs1.getInt(2));
//		}
		
		System.out.println(rs2);
		//rs1.close();
		st.close();
		con.close();
		
		System.out.println("all connection closed");
	}	
}
