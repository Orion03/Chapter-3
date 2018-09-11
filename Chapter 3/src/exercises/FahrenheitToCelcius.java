package exercises;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double temperatureAtEight;
		double temperatureAtTwelve;
		double temperatureAtFive;
		
		System.out.println("Please enter the temperature it was at 8:00 >> ");
		temperatureAtEight = input.nextDouble();
		
		FahrenheitToCelsius(temperatureAtEight);
	}
	
	public static void FahrenheitToCelsius(double temperatureAtEight) {
		double Celsius;
		Celsius = (temperatureAtEight - 32) * 5/9;
		System.out.println(temperatureAtEight + " degrees fahrenheit is " + Celsius + " degrees celsius.");
	}

}
