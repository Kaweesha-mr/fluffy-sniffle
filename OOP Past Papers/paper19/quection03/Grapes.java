package quection03;

public class Grapes implements IFruit {

	String country;
	String color;
	
	public Grapes(String country, String color) {
		super();
		this.country = country;
		this.color = color;
	}




	@Override
	public String displayFruitDetails() {
		// TODO Auto-generated method stub
		return "The Graphes Imported from = "+country+ ", and the color is ="+color;
	}

}
