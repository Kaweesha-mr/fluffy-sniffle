package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class exersice4 {

	public static void main(String[] args) throws Throwable {
		String length,width,height;
		double volume;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Length :");
		length = reader.readLine();
		
		
		System.out.print("Enter width :");
		width = reader.readLine();

		System.out.print("Enter height :");
		height = reader.readLine();
		
		
		volume = Double.parseDouble(length)*Double.parseDouble(width)*Double.parseDouble(height);
		
		
		System.out.println("volume :" + volume);
		

	}

}
