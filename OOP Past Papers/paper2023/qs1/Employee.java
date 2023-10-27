package qs1;

import java.util.Scanner;

public class Employee {
	
	protected String EmpID;
	protected String name;
	protected String address;
	
	Scanner scn = new Scanner(System.in);
	
	public Employee(String empID, String name, String address) {
		super();
		EmpID = empID;
		this.name = name;
		this.address = address;
	}
	
	public void read() {
		
		
		System.out.println("Enter Employee Number:");
		EmpID =  scn.next();
		
		System.out.println("Enter Name of Employee:");
		name = scn.next();
		
		System.out.println("Enter Address of Employee");
		address = scn.next();
		
	}
	
	public void print() {
		
		System.out.println("Employee Id is :"+EmpID);
		
		
		System.out.println("Employee Name is :"+name);
		
		
		System.out.println("Employee Address :"+address);
		
		System.out.println();
		
	}
	
	
	

}
