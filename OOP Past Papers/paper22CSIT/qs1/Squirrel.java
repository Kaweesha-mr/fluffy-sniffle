package qs1;

public class Squirrel extends Pet {
	
	String command;
	
	public Squirrel(String command) throws CaughtException {
		
		this.command = command;
		isCaught(command);
	}
	
	public boolean isCaught(String command) throws CaughtException {
		
		try {
			
		if(command.contains("Run")) {
			
			throw new CaughtException("caught");
		}
		else {
			
			System.out.println("Did not cought");
			return false;
		}
		
		}
		catch (CaughtException e) {
			return true;
			
			
		}
		
		
	}
	
	
	
	
	
	public void feed() {
		System.out.println("Feeding the Squirrel");
		
	}
	
	public void clean() {
		
		System.out.println("Cleaning the Squirrel");
		
	}
	
	public void cudle() {
		
		System.out.println("Cuddling the Squirrel");
		
	}
	
	public void GetTotalPoints() {
		
		
	}

}
