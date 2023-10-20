package Quection01;

public class Dahl extends Item {

	
	double qtylnKilos;
	
	
	public Dahl(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	@Override
	String displayItem() {
		// TODO Auto-generated method stub
		return "Dahl";
	}

	@Override
	double getCost() {
		
		return 750;
	}

	@Override
	double getQuantity() {
		
		return qtylnKilos;
	}



}
