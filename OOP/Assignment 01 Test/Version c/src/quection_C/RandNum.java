package quection_C;

import java.util.Random;

public class RandNum {
	//decleare a 2d array
	int [][] rand = new int [5][5];
	
	//create a object using random class
	Random random = new Random();
	
	//constructor to assign values to 2d arrays
	public RandNum() {
		for (int i =0; i<5; i++){
			for (int j =0; i<5; i++){
				rand[i][j] = random.nextInt(1,100);
				
			}
		}
	}

	public int Maximum() {
		int max = 0;
		
		for (int i =0; i<5; i++){
			for (int j =0; i<5; i++){
				
				if(max < rand[i][j]) {
					max = rand[i][j];
				}				
			}
		}
		
		
		return max;
		
	}
	public int minimum() {
		int min = rand[0][0];
		
		for (int i =0; i<5; i++){
			for (int j =0; i<5; i++){
				
				if(min > rand[i][j]) {
					min = rand[i][j];
				}				
			}
		}
		
		
		return min;
		
	}
	
}
