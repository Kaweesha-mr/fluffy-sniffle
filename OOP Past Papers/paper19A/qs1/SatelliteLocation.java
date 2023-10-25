package qs1;

public class SatelliteLocation implements IGeoLocation {

	
	String location;
	
	
	
	public SatelliteLocation(String location) {
		super();
		this.location = location;
	}



	@Override
	public void displayLocation() {
		System.out.println("Satellite Location" + location );

	}

}
