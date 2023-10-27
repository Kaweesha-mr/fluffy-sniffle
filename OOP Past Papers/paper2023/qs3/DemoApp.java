package qs3;

import java.util.Scanner;

import quection03.IFruit;

public class DemoApp {
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String username = null;
		String password = null;
		
		System.out.println("Enter Username :");
		username = scn.next();
		
		System.out.println("Enter a Password");
		password = scn.next();
		

		
		try {
			
			if(username.length() < 6) {
				
				throw new InvalidUserName();
			}
			
			if(password.length() < 8) {
				
				throw new InvalidPasswordLength();
				
			}
			
			if(containsDigit(password) &&  containsLowercase(password) && containsUppercase(password)) {
				throw new InvalidPassword();
			}
			
		} catch (InvalidPassword | InvalidUserName | InvalidPasswordLength  e) {
			
			System.out.println("Error : " + e.getMessage());
			
			
		}
		

	}
	
	//check if contains uppercase
    public static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean containsLowercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
