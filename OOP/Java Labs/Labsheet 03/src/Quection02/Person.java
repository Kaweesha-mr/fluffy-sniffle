package Quection02;

public class Person {
	
	String name;
	String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void ShowDetails() {
		
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
	}

}
