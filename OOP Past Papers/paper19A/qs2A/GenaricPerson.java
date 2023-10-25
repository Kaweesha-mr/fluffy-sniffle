package qs2A;

import java.util.ArrayList;

public class GenaricPerson<T>{
	
	
	
	
	public void displayElements(ArrayList<T> list){
		
		for(T obj: list) {
			
			if(obj instanceof Student) {
				
				Student s1 = (Student) obj;
				
				System.out.println(s1.displayDetails());
				
			}
			
			else if(obj instanceof Lecturer) {
				
				Lecturer t1 = (Lecturer) obj;
				
				System.out.println(t1.displayDetails());
			}
			
			
			
		}
		
		
		
	}

}
