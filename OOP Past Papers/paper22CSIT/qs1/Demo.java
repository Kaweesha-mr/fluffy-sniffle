package qs1;

public class Demo {

	public static void main(String[] args) throws CaughtException {
		
		Pet squirrel1 = new Squirrel("Run5");
		squirrel1.cudle();
		squirrel1.feed();
		squirrel1.GetTotalPoints();
		
		
		Pet squirael2 = new Squirrel();
		squirael2.cudle();
		squirael2.feed();
		squirael2.GetTotalPoints();
//		
		Pet garfiledPet = new Cat();
		garfiledPet.clean();
		garfiledPet.cudle();
		garfiledPet.feed();
		garfiledPet.GetTotalPoints();
//		
		Pet parrot1 = new Parrot("Walk");
		parrot1.feed();
		parrot1.GetTotalPoints();
		
	}

}
