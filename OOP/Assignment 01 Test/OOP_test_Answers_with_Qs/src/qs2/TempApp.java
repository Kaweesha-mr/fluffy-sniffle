package qs2;

import java.util.Scanner;

public class TempApp {
	
	public static void main(String[] args) {
		double value1,value2;
		
		
		TemperatureConverter app1 = new TemperatureConverter();
		TemperatureConverter app2 = new TemperatureConverter();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value for app 1:");
		value1 = scn.nextDouble();
		
		System.out.println("Enter value for app 1:");
		value2 = scn.nextDouble();
		
		System.out.println("value in Fahrenheit :" + app1.celsiusToFahrenheit(value1));
		System.out.println("value in Celcius :" + app1.FahrenheitTocelsius(value2));
		
		
		
		
		
	}

}
