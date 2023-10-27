package qs1;

public class Squirrel extends Pet {
	
	String command;
	
	public Squirrel(String command) {
		
		this.command = command;
		
	}
	
	public Squirrel() {
		command="";
		
	}

	public boolean isCaught(String command){
		
		try {
			
		if(command.contains("Run5")) {
			
			throw new CaughtException("caught");
		}
		else {
			
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
		System.out.println("Feeding the Squirrel");
		
	}
	
	public void clean() {
		
		points = points + 10;
		System.out.println("Cleaning the Squirrel");
		
	}
	
	public void cudle() {
		
		points = points + 15;
		System.out.println("Cuddling the Squirrel");
		
	}
	
	public void GetTotalPoints() {
		
		if(isCaught(command) == true) {
			
			points =0;
			
		}
		else {
			System.out.println("Did not cought");
			System.out.println("Total point is "+ points);
		
		}
		
		
		

		
	}
}
