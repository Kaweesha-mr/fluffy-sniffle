package qs1;

public class Cat extends Pet {
	
	
	
	public void feed() {
		points = points + 5;
		System.out.println("Feeding the cat");
		
	}
	
	public void clean() {
		points = points + 10;
		System.out.println("Cleaning the cat");
		
	}
	
	public void cudle() {
		points = points + 15;
		System.out.println("Cuddling the cat");
		
	}
	
	public void GetTotalPoints() {
		System.out.println("Total point is "+ points);
	}

}
