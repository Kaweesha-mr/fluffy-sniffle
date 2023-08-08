package Exersice_1;

public class Book implements IDisplay, IInput {
	
	int bookId;
	String title,publisher;
	@Override
	public void input() {
		
		System.out.println("this is input method");
		
	}

	@Override
	public void print() {
		System.out.println("this is print method of book class");

	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("this is printdetails method of book class");

	}

}
