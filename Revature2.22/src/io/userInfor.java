package io;

import java.util.HashMap;

public class userInfor {
	
	private HashMap<String, String> userData= new HashMap<>();
	
	// sets userName and password pair
	public void setUserData(String userName, String password) {
		this.userData.put(userName, password);
	}
	
	
	// get password with userName input	
	public String getPassword(String userName) {		
		return userData.get(userName);		
	}

	
	// validations
	public void validateUserName(String userName) throws loggingFailedException{		
		if (userData.containsKey(userName)){			
			System.out.println("username in the system");
		}else {
			throw new loggingFailedException("username not in the system");
		}
		
	}
		
	public void validatePassword(String userName, String inputedPassword) throws loggingFailedException{		
		if (inputedPassword.equals(getPassword(userName))){			
			System.out.println("logging success");
		}else {
			throw new loggingFailedException("wrong password");
		}
		
	}
	
	
	

}
