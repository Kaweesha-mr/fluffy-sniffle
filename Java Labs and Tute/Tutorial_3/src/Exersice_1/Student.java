package Exersice_1;

public class Student implements IDisplay, IInput {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("this is print method of student");

	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub

		System.out.println("this is printdetail methd of student class");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("this is input method of student class");
	}

}
