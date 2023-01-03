package com.com.domain;

public class PostgreInsertDTO {
	
	private String userId;
	private String userName;
	private String userPassword;
	private String userAuthority;
	

	public PostgreInsertDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PostgreInsertDTO(String userId, String userName, String userPassword, String userAuthority) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAuthority = userAuthority;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserAuthority() {
		return userAuthority;
	}


	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}
	
}
