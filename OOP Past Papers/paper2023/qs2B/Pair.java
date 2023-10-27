package qs2B;

public class Pair <T,U>{
	
	T num1;
	U num2;
	
	public Pair(T num1, U num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public T getFirst() {
		return num1;
	}
	
	public U getSecond() {
		
		return num2;
		
	}
	

}
