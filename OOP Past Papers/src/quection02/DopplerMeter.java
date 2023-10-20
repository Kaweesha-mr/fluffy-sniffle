package quection02;

import java.util.Scanner;

public class DopplerMeter {
	static float speed;
	public static void MonitorSpeed() throws HighSpeedException {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Speed");
		speed = scn.nextInt();
		
	}
	
	public static void main(String[] args) throws HighSpeedException {
		
		
		
		
		
		while(!(speed<=100 && speed >= 50)) {	
		MonitorSpeed();
		try {
		
		if(speed>=100) {
			
			throw new HighSpeedException(speed);
		}
		else {
			
			throw new HighSpeedException(speed);
			
			}
		}
		
		catch (HighSpeedException e) {
			
			
		}
		
		}
		
		System.out.println("Program Terminated");

		
		
		
		
		
		

	}

}
