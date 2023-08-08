package Exersice_1;


public class Student {
	
	int studentID;
	String name;
	String digree;
	String Mobile;
	static int max = 100;
	
	public Student(String name, String digree, String mobile) {
		
		this.studentID = ++max;
		this.name = name;
		this.digree = digree;
		Mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getDigree() {
		return digree;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDigree(String digree) {
		this.digree = digree;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
	public void print() {
		
		System.out.println("Student_Id :"+this.studentID);
		System.out.println("Name :"+this.name);
		System.out.println("Mobile :"+this.Mobile);
		System.out.println("degree :"+this.digree);
		
	}
	
	static public int getNextStudentId() {
		
		return max+1;
		
	}
	

}
