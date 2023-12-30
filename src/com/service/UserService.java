package com.service;
import com.management.*;
import com.model.User;
public class UserService {

	public boolean checkUser(String userId, String password) {
		UserManagement obj = new UserManagement();
		boolean bool = obj.checkUserInDataBase(userId,password);
		return bool;
	}
//	public User buildUserObject(String userDetails){
//		String[] user = userDetails.split(":");
		
//		return new User( ;
		
//	}
//	public boolean addUser(String userDetails) {
		
//	}
}
//User00890add 