package Version_A;

import java.util.Random;
import java.util.Scanner;

public class LotteryNumbers {
	
	int [] arr = new int[5];
	
	public LotteryNumbers() {
		
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(9);
		}
		
	}
	
	
	public void compare(int user[]) {
		
		int count =0;
		
		int[] matching = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < user.length; j++) {
				
				if(user[i] == arr[j]) {
					count++;
					matching[i] = user[i];
					
				}
				
			}
			
			
		}
			
		System.out.print("User's Numbers :");
		for (int i = 0; i < user.length; i++) {
			
			System.out.print(" "+user[i]);
		}
		
		System.out.println();
		
		
		System.out.print("Lottery Numbers :");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Number of matching digits :"+ count);
		
		System.out.print("Matching digits : ");
		
		for (int i = 0; i < matching.length; i++) {
			
			if(matching[i] == 0) {
				continue;
			}
			System.out.print(" " + matching[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		LotteryNumbers ticket1 = new LotteryNumbers();
		Scanner scn  = new Scanner(System.in);
		int[] user = new int[5];
		for (int j = 0; j < user.length; j++) {
			
			System.out.println("Enter your Ticket numbers");
			user[j] = scn.nextInt();
		}
		
		ticket1.compare(user);
		
		
		
	}
	

}
