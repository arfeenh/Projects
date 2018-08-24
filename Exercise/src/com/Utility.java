package com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility {


	
	public static Connection con=null;
	public static Statement st = null;
	public static ResultSet rs;
	
/*	public static void main(String [] args  ) throws ClassNotFoundException, SQLException {
		getConnection();
	}*/
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
	
	public static void update(String query) throws SQLException {
		
		st=con.createStatement();
		st.executeUpdate(query);
		
	}
	
	public static ResultSet select(String query) throws SQLException {
		

		st=con.createStatement();
		return st.executeQuery(query);
		
	}
	
	public static void close() throws SQLException {
	
		if(rs!=null) {
			rs.close();
		}
		if(st!=null) {
			st.close();

		}
		if(con!=null) {
			con.close();
		}
		
	}
}
