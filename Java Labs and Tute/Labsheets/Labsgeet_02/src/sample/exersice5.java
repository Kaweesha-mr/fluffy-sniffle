package sample;

public class exersice5 {

	public static void main(String[] args) {
		
		EvenOddNumber num1 = new EvenOddNumber();
		
		boolean isit = num1.findEvenOrOdd(4);
		
		if (isit == true) {
			
			System.out.println("Number is Even");
		}
		else {
			
			System.out.println("Number is Odd");
		}
		
	}

}
