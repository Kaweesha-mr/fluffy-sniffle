package qs1;

public class PartimeEmployee extends Employee {
	
	int OTHrs;
	
	public PartimeEmployee(String name,double salary,int othrs) {
		super(name,salary);
		OTHrs = othrs;
	}
	public void displayEmpInfo() {
		super.displayInfo();
		System.out.println("OT Hours :"+this.OTHrs);
	}
	

}
