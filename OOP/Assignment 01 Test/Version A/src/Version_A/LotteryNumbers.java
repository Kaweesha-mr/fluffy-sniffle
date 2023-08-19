package Version_A;

import java.util.Random;

public class LotteryNumbers {
	
	int [] arr = new int[5];
	
	public LotteryNumbers() {
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(9)
		}
	}
	
	public void compare(int user[]) {
		
		int count =0;
		
		int[] matching = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == user[i]) {
				count++;
				matching[i] = user[i];
				}
		}
		
		System.out.println("User's Numbers :");
		for (int i = 0; i < user.length; i++) {
			
			System.out.print(" "+user[i]);
		}
		System.out.println("Lottery Numbers :");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("Number of matching digits :"+count);
		
		System.out.println("Matching digits : ");
		
		for (int i = 0; i < matching.length; i++) {
			
			if(matching[i] == 0) {
				continue;
			}
			System.out.print(" " + matching[i]);
		}
		
		
		
		
		
	}
	

}
