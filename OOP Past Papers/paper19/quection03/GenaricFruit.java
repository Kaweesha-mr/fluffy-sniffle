package quection03;

import java.util.ArrayList;

public class GenaricFruit<T> {
	
	public  void showElements(ArrayList<T> fruitlist) {
		
		for(T fruit: fruitlist) {
			
			if(fruit instanceof Grapes) {
				
				Grapes grapes = (Grapes) fruit;
				System.out.println(grapes.displayFruitDetails());
			}
			else if (fruit instanceof Apple) {
				
				Apple apple = (Apple) fruit;
				System.out.println(apple.displayFruitDetails());
			}
			 
		}
	}
	
	
	
	
}
