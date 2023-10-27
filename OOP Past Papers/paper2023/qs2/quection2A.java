package qs2;

import java.util.ArrayList;
import java.util.Scanner;

public class quection2A {

	public static <E> void main(String[] args) {
		
		
		ArrayList <Integer> numList = new ArrayList<Integer>();
		Scanner scn = new Scanner(System.in);
		
		int usrIn;
		
		System.out.println("Enter Numbers (0 to quit)");
		
		do {
			
			usrIn = scn.nextInt();
			numList.add(usrIn);
			
		}while(usrIn !=0);
		
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		
		for(int i=0; i< numList.size(); i++) {
			
			if(numList.get(i)%2 != 0) {
				
				numList.remove(i);
			}
		}
		
	
		
		
		System.out.println("Even Numbers : " + numList);
		
		

	}

}
