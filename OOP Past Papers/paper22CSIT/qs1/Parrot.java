package qs1;

public class Parrot extends Pet {

	String command;
	
	
	public Parrot(String command) throws CaughtException {
		
		this.command = command;
		
	}
	
	
public boolean isCaught(String command) throws CaughtException {
		
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
			return true;
			
			
		}
		
		
	}
	
	public void feed() {
		System.out.println("Feeding the Parrot");
		
	}
	
	public void clean() {
		
		System.out.println("Cleaning the Parrot");
		
	}
	
	public void cudle() {
		
		System.out.println("Cuddling the Parrot");
		
	}
	
	public void GetTotalPoints() throws CaughtException {
		
		
		if(isCaught(command) == true) {
			
			setPoints(0);
			
		}
		
		
	}
}
