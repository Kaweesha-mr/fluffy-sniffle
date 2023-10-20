package Quection01;

public class Food implements IAccountable{
	
	
	//creating a empty array using Item class
	Item[] itemsArr = null;
	
	
	
	public Food( Item[] items) {
		
		
		//assign the values to array created in this class
		this.itemsArr = items;
		
	}
	
	
	@Override
	public void calcuateCost() {
		
		
		
		//iterate through array element 
		for(int i=0; i<itemsArr.length; i++) {
			
			System.out.println(itemsArr[0].displayItem());
			System.out.println(itemsArr[0].getQuantity()*itemsArr[0].getCost());

			
			
			
			System.out.println("\n");
			
			
			
			
			//get the values using objects functions
			//System.out.println(itemsArr[i].displayItem()+"=>" +itemsArr[i].getCost()+"*"+itemsArr[i].getQuantity()+" = "+ (itemsArr[i].getCost()*itemsArr[i].getQuantity())+"\n" );
			
		}
		
		
		
		
	}
	
	

}
