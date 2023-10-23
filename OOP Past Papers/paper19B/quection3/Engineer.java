package quection3;

public class Engineer implements IEmployee {
	
	String company;
	String employeeID;
	
	public Engineer(String company, String employeeID) {
		super();
		this.company = company;
		this.employeeID = employeeID;
	}

	@Override
	public String showEmployeeDetails() {
		// TODO Auto-generated method stub
		return "Engineer = " +employeeID +", Salary " + company ;
		
	}
	
	
	
	

}
