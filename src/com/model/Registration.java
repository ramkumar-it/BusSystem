package com.model;

public class Registration {
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String userId;
	private long mobileNumber;
	public Registration(String firstName, String lastName, String password, String confirmPassword, String userId,
			long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Registration [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", userId=" + userId + ", mobileNumber=" + mobileNumber
				+ "]";
	}

}
