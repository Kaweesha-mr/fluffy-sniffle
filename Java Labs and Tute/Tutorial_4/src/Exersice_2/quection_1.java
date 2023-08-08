package Exersice_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class quection_1 {
	
	static int sum =0;
	public static void main(String[] args) {
		ArrayList<Integer>  data = new ArrayList<Integer>();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter count of numbers you want to Enter: ");
		int count = scn.nextInt();
		
		for (int i = 0; i < count; i++) {
			
			System.out.println("Enter Number :");
			int num1 = scn.nextInt();
			data.add(num1);
		}
		
		for (int i:data) {
			
			
			
			sum = sum + i;
		}
		
//		works same as an array index 
		
		System.out.println("Sum of Numbers :" + sum);
		System.out.println("Average : "+(float)(sum/data.size()));
	}
		

}
