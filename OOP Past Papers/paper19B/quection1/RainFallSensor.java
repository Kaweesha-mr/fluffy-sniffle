package quection1;

public class RainFallSensor implements ISensor {

	
	String name;
	
	public RainFallSensor(String name) {
		// TODO Auto-generated constructor stub
	
		this.name = name;
	}
	
	public void on() {
		
		System.out.println(name + "switched on");
	}

	public void off() {
		
		System.out.println(name + "switched off");
		

	}
}


