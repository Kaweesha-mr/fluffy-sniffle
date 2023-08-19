package quection01;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		RoomChargeCalculator user1 = new RoomChargeCalculator();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Room Charge Calculator\n"
				+ "1.Delux-Double\n"
				+ "2.Standard-Family\n"
				+ "2.Standard-Single\n"
				+ "4.Quit");
		
		int type = scn.nextInt();
		
		if(type == 4) {
			
			System.out.println("quited");
			System.exit(0);
			
		}
		else if ((type == 1) ||  (type == 2) || (type == 3)) {
			user1.types(type);
		}
		else{
			System.out.println("Please Enter valid value");
		}
	}

}
