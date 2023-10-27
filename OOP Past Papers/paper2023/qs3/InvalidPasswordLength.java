package qs3;

public class InvalidPasswordLength extends Exception {
	
	public InvalidPasswordLength() {
		super("The\n"
				+ "password must be at least 8 characters long");
	}

}
