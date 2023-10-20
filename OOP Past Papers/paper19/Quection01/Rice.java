package Quection01;

public class Rice extends Item {
	
	
	double qtylnKilos;
	
	
	

	public Rice(double qtylnKilos) {
		super();
		this.qtylnKilos = qtylnKilos;
	}

	@Override
	String displayItem() {
		
		return "Rice :"+ qtylnKilos;
	}

	@Override
	double getCost() {
		
		return 1000;
	}

	@Override
	double getQuantity() {
		
		return qtylnKilos;
	}


}
