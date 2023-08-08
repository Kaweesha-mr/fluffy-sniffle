package Exersice_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ArithmeticException{
		
//		scanner obj created
		Scanner scnScanner = new Scanner(System.in);
		
		
//		try block is used to tell system to try this 
		try {
			
			System.out.println("Enter Number :");
			int i = scnScanner.nextInt();
			
			if (i<0) {
				
//				this condition is used to create a exception by programmer becouse if the entererd value is less that zero it
//				it cannot have a root
				throw new ArithmeticException();
			}
			
			System.out.println("Square Root of i :" +Math.sqrt(i));
			
		}
//		catch arithmatricExceptions means if there is a numbering error it will be catch by this
		catch (ArithmeticException e) {
			System.out.println("insterted a minus value");
		}
//		exception parameter is used here because if there are any other error didnt catch it will be catch by this
		catch (Exception e) {
			System.out.println("Insterted a invalid parameter");
		}
		
		
		

	}

}
