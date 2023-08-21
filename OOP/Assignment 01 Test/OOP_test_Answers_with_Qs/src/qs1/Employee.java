package qs1;

public class Employee {
	String name;
	Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Name :"+ this.name);
		System.out.println("Salary :" +this.salary);
	}
	
	
	
	

}
