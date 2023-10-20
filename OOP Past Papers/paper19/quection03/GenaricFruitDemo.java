package quection03;

import java.util.ArrayList;

public class GenaricFruitDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Grapes> grapes = new ArrayList<>();
		grapes.add(new Grapes("Australia", "Black"));
		grapes.add(new Grapes("Sri Lanka", "Red"));
		grapes.add(new Grapes("Spain", "white"));
		
		
		
		
		ArrayList<Apple> apple = new ArrayList<Apple>();
		apple.add(new Apple("Australia", 300.0));
		apple.add(new Apple("USA", 340.0));
		apple.add(new Apple("Sri Lanka", 259.00));
		
		
		GenaricFruit<Grapes> genaricFruit1 = new GenaricFruit<>();
		genaricFruit1.showElements(grapes);
		
		
		System.out.println("\n");

		GenaricFruit<Apple> genaricFruit2 = new GenaricFruit<>();
		genaricFruit2.showElements(apple);
			

	}

}
