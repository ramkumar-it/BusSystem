package com.management;
import java.io.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class DBConnectionManagement {
	
//	public static void main(String[] args) throws Exception{
//		
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root", "");
//		
//	}
	private static Connection con =null;
	private static Properties props = new Properties();

	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		try {
			FileInputStream fis =null;
			fis = new FileInputStream ("src/db.properties");
			props.load(fis);
			Class.forName(props.getProperty("DB_DRIVERE_CLASS"));
		con = DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
	}
		catch(IOException e){
		// TODO Auto-generated method stub
			e.printStackTrace();
		}
		return con;
	}

}
