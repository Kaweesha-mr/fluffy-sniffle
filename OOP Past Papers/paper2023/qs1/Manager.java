package qs1;



public class Manager extends Employee {
	
	String Department;
	int ProductNo1,ProductNo2,ProductNo3;
	
	public Manager(String empID, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		
		super(empID, name, address);
		Department = department;
		ProductNo1 = productNo1;
		ProductNo2 = productNo2;
		ProductNo3 = productNo3;
	}
	
	public void read() {
		
		
		System.out.println("Enter Employee Number:");
		EmpID =  scn.next();
		
		System.out.println("Enter Name of Employee:");
		name = scn.next();
		
		System.out.println("Enter Address of Employee");
		address = scn.next();
		
		System.out.println("Enter Department of Employee");
		Department = scn.next();
		
		
		try{
			
		System.out.println("Enter product Num 1");
		ProductNo1 = scn.nextInt();
		
		System.out.println("Enter product Num 2");
		ProductNo2 = scn.nextInt();
		
		System.out.println("Enter product Num 3");
		ProductNo3 = scn.nextInt();
		}
		catch (NumberFormatException e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	public void print() {
		
		System.out.println("Employee Id is :"+EmpID);
		
		
		System.out.println("Employee Name is :"+name);
		
		
		System.out.println("Employee Address :"+address);
		
		
		System.out.println("Leading First product is :"+ProductNo1);
		
		
		System.out.println("Leading second product is :"+ProductNo2);
		
		
		System.out.println("Leading three product is :"+ProductNo3);
		
		System.out.println();
		
	}
	
	
	
	

}
