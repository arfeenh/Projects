package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class model {
	
	public static boolean validateUser(String user, String pass, int role) throws ClassNotFoundException, SQLException {
		Utility.getConnection();
		ResultSet rs = Utility.select("select password from User1559835 where email='"+user+"'");
		ResultSet rs1 = Utility.select("select role from User1559835 where email='"+user+"'");

		String password="null";
		int checkrole=-1;
		while(rs.next()) {
			password=rs.getString(1);
		}
		while(rs1.next()) {
			checkrole=rs1.getInt(1);
		}
		if(password.equals(pass)&& checkrole==role) {
			Utility.close();
			return true;
		}
		else {
			Utility.close();
			return false;
		}
	}
	
	public static void registerUser(String email, String pass, int role, String fullname, int gender, String phone, String pic, String dob) throws SQLException, ClassNotFoundException {
		Utility.getConnection();
		pic="dede";
		System.out.println(("insert into user1559835 values('"+email+"','"+pass+"',"+role+",'"+fullname+"',"+gender+",'"+phone+"','"+pic+"','"+dob+"')"));
		Utility.update(("insert into user1559835 values('"+email+"','"+pass+"',"+role+",'"+fullname+"',"+gender+",'"+phone+"','"+pic+"','"+dob+"')"));
		//System.out.println((("insert into user1559835 values('"+email+"','"+pass+"','"+role+"','"+fullname+"','"+gender+"','"+phone+"','"+pic+"')")));
		//Utility.update("insert into user1559835 values('+email+','+pass+',+role+','+fullname+','+gender+','+phone+','+pic+')");
		Utility.close();
	}
	public static boolean updatePass(String user, String pass,String newpass) throws ClassNotFoundException, SQLException {
		Utility.getConnection();
		ResultSet rs = Utility.select("select password from User1559835 where email='"+user+"'");
		
		String password1="null";
		
		while(rs.next()) {
			password1=rs.getString(1);
		}
		if(password1.equals(pass)) {
			Utility.update("update user1559835 set password ='"+newpass+"' where email='"+user+"'");
			Utility.close();
			return true;
		}
		else {
			Utility.close();
			return false;
		}
	}
	
}
