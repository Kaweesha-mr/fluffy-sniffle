package quection3;

import java.util.ArrayList;

public class GenaricEmployee<E> {
	

	public void showelement(ArrayList<E> arr){
		
		for (E item : arr ) {
			
			if(item instanceof Engineer) {
				
				Engineer e = (Engineer) item;
				e.showEmployeeDetails();
				
			}
			
			if((item instanceof Manager)){
				
				Manager e = (Manager) item;
				e.showEmployeeDetails();
				
			}
		}
		
		
	}
}
