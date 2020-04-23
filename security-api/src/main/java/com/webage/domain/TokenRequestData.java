package com.webage.domain;

public class TokenRequestData {
	String username;
	String password;
	
	public TokenRequestData() {
		
	}
	
	public TokenRequestData(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
	
}
