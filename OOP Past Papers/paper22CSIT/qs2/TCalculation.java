package qs2;

import java.util.ArrayList;

public class TCalculation <Number> {

	ArrayList<Number> numList = new ArrayList<Number>();
	
	
	public void append(Number num) {
		numList.add(num);
		
	}
	
	public double average() {
		
		double sum = 0;
		
		for(Number n : numList) {
			
			
			if(n instanceof Integer) {
				
				sum += ((Integer) n).doubleValue(); 
			}
			else if (n instanceof Double) {
                sum += (Double) n;
            }
		}
		
		return sum / numList.size();
		 
	}

}
