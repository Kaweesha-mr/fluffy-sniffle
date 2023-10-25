package qs2A;

public class Student implements IPerson {
	
	String StudentID;
	int grade;
	
	
	public Student(String studentID, int grade) {
		super();
		StudentID = studentID;
		this.grade = grade;
	}


	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return "Student = "+ StudentID + ",Grade = "+grade;
	}
	
	

}
