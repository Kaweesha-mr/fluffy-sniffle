package quection;

public class Manager extends Employee {

	String DepName;
	int DepId;
	public Manager(String empId, String name, String address, String depName, int depId) {
		super(empId, name, address);
		DepName = depName;
		DepId = depId;
	}
	

	
	

}
