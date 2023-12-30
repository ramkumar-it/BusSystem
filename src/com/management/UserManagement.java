package com.management;

import java.sql.*;

public class UserManagement {

	public boolean checkUserInDataBase(String userId, String password) {
		Connection con = null;
		try {
			con = DBConnectionManagement.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement pst;
		boolean bool = false;
		try {
			pst = con.prepareStatement("select * from b_user where userId=? and password =? ");
			pst.setString(1,userId);
			pst.setString(2,password);
			
			ResultSet rs= pst.executeQuery();
			
			
		
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bool;
	}
}
