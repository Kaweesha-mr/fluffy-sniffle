package qs2;

public class TemperatureConverter {
	
	double temparature;

	public TemperatureConverter() {
		this.temparature = 0;
	}

	public double getValue() {
		return temparature;
	}	
	
	public double celsiusToFahrenheit(double celi) {
		
		
		return ((celi*9)/5)+32;
		
	}
	
	public double FahrenheitTocelsius(double f) {
		
		
		return  ((f-32)*5)/9;
		
	}
	

}
