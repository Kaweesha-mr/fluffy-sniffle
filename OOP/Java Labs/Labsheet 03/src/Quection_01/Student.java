package Quection_01;

public class Student {
	
	private String name;
	private String address;
	private int ditNo;
	
	public Student(String name, String address, int ditNo) {
		this.name = name;
		this.address = address;
		this.ditNo = ditNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDitNo() {
		return ditNo;
	}

	public void setDitNo(int ditNo) {
		this.ditNo = ditNo;
	}
	
	public String getDetails() {
		
		return "I am a Student.\n" + "My Name is "+ this.name +"\nI am from"+this.address+"\nMy dit no"+this.ditNo;
		
	}
	
	
	

}
