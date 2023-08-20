package quection_01;

import java.util.Scanner;

public class Manager extends Employee {
	
	String Department;
	int ProductNo1,ProductNo2,ProductNo3;
	
	public Manager(String empId, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		super(empId, name, address);
		Department = department;
		ProductNo1 = productNo1;
		ProductNo2 = productNo2;
		ProductNo3 = productNo3;
	}
	
	
	public void read() {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Department :");
		this.Department =  scn.next();
		
		System.out.println("Product 01");
		this.ProductNo1 = scn.nextInt();
		
		System.out.println("Product 02");
		this.ProductNo1 = scn.nextInt();
		
		System.out.println("Product 03");
		this.ProductNo1 = scn.nextInt();
	}
	
	public void Print() {
		
		System.out.println("Department :"+this.Department);
		
		System.out.println("Product 01"+this.ProductNo1);
		
		System.out.println("Product 02"+this.ProductNo2);
		
		System.out.println("Product 03"+this.ProductNo3);
		
	}

}
