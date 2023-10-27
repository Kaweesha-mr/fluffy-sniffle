package qs3;

public class InvalidPassword extends Exception {
	public InvalidPassword() {
		super("The password must contain at least one uppercase letter, one lowercase letter, and one dig");
	}
}
