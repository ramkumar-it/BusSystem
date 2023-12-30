package com.model;

public class User {

	private String userId;
	private String password;
	private String userName;
	private int age;
	private String gender;
	private long mobileNumber;
	private String address;
	private String passengerId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public User(String userId, String password, String userName, int age, String gender, long mobileNumber,
			String address, String passengerId) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.passengerId = passengerId;
	}
	
	
}
