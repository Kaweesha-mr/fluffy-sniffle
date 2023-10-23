package quection1;


public class SensorLocation implements IMotionTracker {

	
	
	String location;
	
	public SensorLocation( String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}

	
	@Override
	public void displayLocation() {
		System.out.println("Sensor Location is = "+location);
		
	}

}
