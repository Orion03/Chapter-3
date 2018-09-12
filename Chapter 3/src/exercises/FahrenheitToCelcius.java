package exercises;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double temperature;
		double temperature2;
		double temperature3;
		
		System.out.println("Please enter the temperature it was at 8:00 >> ");
		temperature = input.nextDouble();
		displayConversion(temperature);
		
		System.out.println("Please enter the temperature it was at 12:00 >> ");
		temperature2 = input.nextDouble();
		displayConversion(temperature2);
		
		System.out.println("Please enter the temperature it was at 5:00 >> ");
		temperature3 = input.nextDouble();
		displayConversion(temperature3);
	}
	
	public static void displayConversion(double temperature4) {
		double Celsius;
		Celsius = (temperature4 - 32) * 5/9;
		System.out.println("The temperature of " + temperature4 + " degrees fahrenheit is " + Celsius + "degrees celsius.");
	}
	
}
