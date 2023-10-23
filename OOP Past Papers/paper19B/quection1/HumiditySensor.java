package quection1;

public class HumiditySensor implements ISensor {
	
	String name;
	
	public HumiditySensor(String name) {
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
