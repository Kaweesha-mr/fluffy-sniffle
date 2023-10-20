package quection03;

public class Apple implements IFruit {
	
	//Declare variables
	String country;
	double price;
	
	
	//assign the values using constructor
	public Apple(String country, double price) {
		super();
		this.country = country;
		this.price = price;
	}


	@Override
	public String displayFruitDetails() {
		// TODO Auto-generated method stub
		return "The Graphes Imported from" + country + ", Price in lKR = "+price;		
	}
	
	
	
	

}
