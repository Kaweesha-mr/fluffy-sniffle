package quection;

import java.util.Scanner;

public class Employee {
	
	//dhsajhd
	String empId,Name,Address;
	
	Scanner scn = new Scanner(System.in);

	
	public Employee(String empId, String name, String address) {
		this.empId = empId;
		Name = name;
		Address = address;
	}
	
	public Employee() {
		this.empId = "";
		Name = "";
		Address = "";
	}
	
	
	public void Read() {
		
		System.out.println("Enter Employee ID: ");
		this.empId = scn.nextLine();
		
		System.out.println("Enter Employee Name: ");
		this.Name = scn.nextLine();
		
		System.out.println("Enter Employee Address : ");
		this.Address = scn.nextLine();
		
		
	}
	
	public void print() {
		
		System.out.println("Employee ID: " +this.empId);
		
		
		System.out.println("Employee Name: " +this.Name);
		
		
		System.out.println("Employee Address : " + this.Address);
		
	}
	
	

}
