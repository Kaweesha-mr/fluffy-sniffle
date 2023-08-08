package sample;

import java.util.Scanner;

public class exersice3 {

	public static void main(String[] args) {
		
		double length,width,height,volume;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Length :");
		length = scn.nextDouble();
		
		System.out.print("Enter width :");
		width = scn.nextDouble();

		System.out.print("Enter height :");
		height = scn.nextDouble();
		
		
		volume = length*width*height;
		
		System.out.println("volume :" + volume);
		
		
		
		
		

				
	}

}
