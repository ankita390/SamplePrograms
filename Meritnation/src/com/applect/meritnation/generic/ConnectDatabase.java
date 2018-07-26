package com.applect.meritnation.generic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;	

public class ConnectDatabase {
	
	public static String connectToDatabase(String dbUrl,String dbusername, String dbpassword) throws  ClassNotFoundException, SQLException 
	{
		String query = "SELECT * FROM mobile_otps m WHERE m.`mobile` = 919122970035;";
		String query1 = "SELECT otp FROM mobile_otps m WHERE m.`mobile` = 919122970035;";
		
		String otp="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,dbusername,dbpassword);
		Statement stmt = con.createStatement();
		stmt.executeQuery(query);	
		ResultSet rs= stmt.executeQuery(query1);	
		while (rs.next())
		{
    	otp = rs.getString(1);
		}
		return otp;
		}
}
