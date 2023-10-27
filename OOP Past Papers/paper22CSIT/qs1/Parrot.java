package qs1;

public class Parrot extends Pet {

	String command;
	
	
	public Parrot(String command)  {
		
		this.command = command;
		
	}
	
	
public boolean isCaught(String command) {
		
		try {
			
		if(command.contains("Walk")) {
			
			throw new CaughtException("caught");
		}
		else {
			
			System.out.println("Did not cought");
			return false;
		}
		
		}
		catch (CaughtException e) {
			System.out.println("CaughtException :" + e.getMessage());
			return true;
			
			
		}
		
		
	}
	
	public void feed() {
		points = points + 5;
		System.out.println("Feeding the Parrot");
		
	}
	
	public void clean() {
		points = points + 10;
		System.out.println("Cleaning the Parrot");
		
	}
	
	public void cudle() {
		points = points + 15;
		System.out.println("Cuddling the Parrot");
		
	}
	
	public void GetTotalPoints() {
		
		if(isCaught(command) == true) {
			
			points =0;
			
		}
		else {
			
			System.out.println("Total point is "+ points);
		
		}
		

		
	}
}
