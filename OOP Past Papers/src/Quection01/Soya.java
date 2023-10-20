package Quection01;

public class Soya extends Item {

	
	double qtylnKilos;
	
	
	
	
	public Soya(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	@Override
	String displayItem() {
		
		return "Soya";
	}

	@Override
	double getCost() {
		
		return 850;
	}

	@Override
	double getQuantity() {
		
		return qtylnKilos;
	}


}
