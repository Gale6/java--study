package io;

import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {		
		
		userInfor uInfor = new userInfor();		

		Scanner s = new Scanner(System.in);	
		
		//setting user info
		System.out.println("setting user info");
		System.out.println("Enter Username");		
		String userName = s.nextLine();
		
		System.out.println("Enter Password");		
		String password = s.nextLine();
		
		uInfor.setUserData(userName, password);		
		
		try {
			//login process			
			System.out.println("logging in");
			System.out.println("Please Enter Username");
			String inputedUserName = s.nextLine();			
			uInfor.validateUserName(inputedUserName);
			
			System.out.println("Please Enter Password");
			String inputedPassword = s.nextLine();	
			uInfor.validatePassword(inputedUserName, inputedPassword);
			
		}catch (loggingFailedException e) {
			System.out.println(e.getMessage());
		}
	}

}
