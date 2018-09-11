package exercises;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double temperature;
		
		System.out.println("Please enter the temperature it was at 8:00 >> ");
		temperature = input.nextDouble();
		
		FahrenheitToCelsius(temperature);
	}
	
	public static void FahrenheitToCelsius(double temperature) {
		double Celsius;
		Celsius = (temperature - 32) * (5/9);
		System.out.println(temperature + " degrees fahrenheit is " + Celsius + " degrees celsius.");
	}

}
