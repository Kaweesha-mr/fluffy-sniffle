package qs1;

public class NavigationSatellite implements ISatellite {

	
	String name;
	
	
	
	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(name+" Drone Satellite Activate");

	}

	@Override
	public void deactivate() {
		System.out.println(name+" Drone Satellite Deactivate");

	}


}
