package quection_01;

import java.util.Scanner;

public class Employee {
	
	String EmpId;
	String name;
	String address;
	
	public Employee(String empId, String name, String address) {
		
		EmpId = empId;
		this.name = name;
		this.address = address;
	}
	
	public  void read() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Emp Id:");
		this.EmpId =  scn.next();
		
		System.out.println("Enter Name ");
		this.name = scn.next();
		
		System.out.println("Enter address");
		this.address = scn.next();
		
	}
	
	public void print() {
		
		System.out.println("Emp Id:"+this.EmpId);
		
		System.out.println("Name "+this.name);
		
		System.out.println("address"+this.address);
		
		
		
	}
	
	

}
