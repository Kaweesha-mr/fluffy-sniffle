package Exersice_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class quection3 {
	public static void main(String args[]) {
		Scanner myscanner = new Scanner(System.in);
		
		int size;
		int count = 0;
		int total = 0;
		float avg;
		
		System.out.println("Enter size of data : ");
		size = myscanner.nextInt();
		
		int data[] = new int[size];
		int index;
		
		
		try {
			System.out.print("Enter Index : ");
			index = myscanner.nextInt();
			
			while (index != -1) {
				System.out.print("Enter a marks : ");
				data[index] = myscanner.nextInt();
				count++;
				total += data[index];
				System.out.print("Enter Index : ");
				index = myscanner.nextInt();
			}
			for (int r = 0; r < size; r++)
				System.out.println(r + " - " + data[r]);
			
			avg = (float) total / count;
			
			System.out.println("Average : " + avg);
			
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero or logical error in math");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Array index is out of the scope");
		}
		catch (InputMismatchException e) {
			System.out.println("Missmatch of entered values");
		}

	}
}
