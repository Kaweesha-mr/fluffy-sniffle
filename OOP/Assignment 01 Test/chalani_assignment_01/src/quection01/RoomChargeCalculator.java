package quection01;

import java.util.Scanner;


public class RoomChargeCalculator {
	
	public void getChargeDeluxDouble(boolean balcony,boolean parking,boolean tv,boolean kitchen,boolean wifi) {

		float fixedFee = 5000;
		
		
		if(balcony) {
			fixedFee+=500;
			
			
		}
		if (wifi) {
			
			fixedFee+=100;
			
		}
		if (kitchen) {
			
			fixedFee+=1000;
			
		}
		if (parking) {
			
			fixedFee += 200;
			
		}
		if (tv) {
			fixedFee += 200;
			
		}
		
		
		System.out.println("Charge is : "+fixedFee);
		
	}
	
	public void getChargeStandardFamily(boolean parking,boolean kitchen, boolean garden) {

		float fixedFee = 3000;
		
		if (kitchen) {
			
			fixedFee+=1000;
			
		}
		if (parking) {
			
			fixedFee += 200;
			
		}
		if (garden) {
			fixedFee += 200;
			
		}
		
		
		System.out.println("Charge is : "+fixedFee);
		
	}
	
	public void getChargeStandardSingle(boolean parking,boolean ac, boolean wifi) {

		float fixedFee = 2000;
		
		if (ac) {
			
			fixedFee+=500;
			
		}
		if (wifi) {
			
			fixedFee += 100;
			
		}
		if (parking) {
			fixedFee += 200;
			
		}
		
		
		System.out.println("Charge is : "+fixedFee);
		
	}
	
	
	public void types(int type) {
		
		boolean balcony;
		boolean parking;
		boolean tv;
		boolean kitchen;
		boolean wifi;
		boolean garden;
		boolean ac;
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Do you need Parking:");
			parking = scn.nextBoolean();
					
			if(type == 1) {
				
				System.out.println("Do you need balcony:");
				balcony = scn.nextBoolean();
				
				System.out.println("Do you need TV:");
				tv = scn.nextBoolean();
				
				System.out.println("Do you need Kitchen:");
				kitchen = scn.nextBoolean();
				
				System.out.println("Do you need WIFI:");
				wifi = scn.nextBoolean();
				
				getChargeDeluxDouble(balcony, parking, tv, kitchen, wifi);
				
				
			}
			else if (type == 2 ) {
				
				System.out.println("Do you need Kitchen:");
				kitchen = scn.nextBoolean();
				
				System.out.println("Do you need WIFI:");
				 garden = scn.nextBoolean();
				 
				 getChargeStandardFamily(parking, kitchen, garden);
				
			}
			else if (type == 3) {
				
				
				System.out.println("Do you need AC:");
				ac = scn.nextBoolean();
				
				System.out.println("Do you need WIFI:");
				 wifi = scn.nextBoolean();
				 
				 getChargeStandardSingle(parking, ac, wifi);
				
			}
		}
		
		
	}
	

	
	

}
