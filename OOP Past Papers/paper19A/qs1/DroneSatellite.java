package qs1;

public class DroneSatellite implements ISatellite {

	String name;
	
	
	public DroneSatellite(String name) {
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
