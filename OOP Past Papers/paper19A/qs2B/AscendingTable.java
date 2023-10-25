package qs2B;

import java.util.TreeMap;

public class AscendingTable <Ineger, T> {
	
	
	TreeMap<Integer, T> list = new TreeMap<>();
	
	
	
	public void add(int num1, T s1) {
		
		list.put(num1, s1);
	}
	
	public void display() {
		
		for(Integer n: list.keySet()) {
			
			System.out.println(list.get(n));
		}
	}
	
	
	
	
	

}
