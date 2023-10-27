package qs2;

public class DemoApp {
	
	
	
	
	public static void main(String[] args) {
		
		TCalculation<Integer> obj = new TCalculation<Integer>();
		TCalculation<Double> obj2 = new TCalculation<Double>();
		
		obj.append(10);
		obj.append(20);
		obj.append(30);
		obj.append(40);
		obj.append(50);
		
		obj2.append(2.4);
		obj2.append(5.4);
		obj2.append(7.4);
		obj2.append(8.4);
		obj2.append(3.4);
		
		
		System.out.println(obj.average());
		System.out.println(obj2.average());
		
		
	}
	

}
