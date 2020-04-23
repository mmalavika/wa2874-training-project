package com.webage.jwt;

public class Authenticator {
	
	public static boolean checkUser(String username) {
		if( (username != null && username.length() > 0) &&
			(username.equalsIgnoreCase("system")) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkPassword(String username, String password) {
		if(checkUser(username)) {
			if(username.equalsIgnoreCase("system") && password.equals("password")) {
				return true;
			}	
		}else {
			return false;
		}
		return false;
	}
	
}
