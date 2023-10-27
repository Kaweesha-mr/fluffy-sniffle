package qs1;

import java.util.ArrayList;

public class EmployeeApp {

	public static <T> void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		arrayList.add( new Employee("EMP101", "kamal Perera", "Colombo"));
		arrayList.add( new Employee("EMP102", "Sunil Fernando", "Kandy"));
		arrayList.add( new Manager("EMP103", "Nimali Hearath", "Kadawatha", "Marketing", 10001, 1002, 10003));
		arrayList.add( new Manager("EMP104", "Hansika Perera", "Rathnaura", "Marketing", 20001, 2002, 20003));
		
		
		
		for(Employee employee : arrayList) {
			
			employee.print();
			
		}
		
		


	}

}
