package Quection02;

public class Student extends Person {
	
	String StudentId;

	public Student(String name, String address, String studentId) {
		super(name, address);
		StudentId = studentId;
	}
	
	public void ShowDetails() {
		
	
		System.out.println(this.StudentId);
	}
	
}
