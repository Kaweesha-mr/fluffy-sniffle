package quection3;

public class Manager implements IEmployee {
	
	String managerID;
	Double salary;
	
	public Manager(String managerID, Double salary) {
		super();
		this.managerID = managerID;
		this.salary = salary;
	}

	@Override
	public String showEmployeeDetails() {
		
		return "Manager Id" + managerID + " " + "Salary =" + salary;
	}
	
	
	
}
