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
		
		System.out.println("Please enter the temperature it was at 12:00 >> ");
		temperatureAtTwelve = input.nextDouble();
		
		System.out.println("Please enter the temperature it was at 5:00 >> ");
		temperatureAtFive = input.nextDouble();
		
		FahrenheitToCelsius1(temperatureAtEight);
		
		FahrenheitToCelsius2(temperatureAtTwelve);
		
		FahrenheitToCelsius3(temperatureAtFive);
	}
	
	public static void FahrenheitToCelsius1(double temperatureAtEight) {
		double CelsiusAtEight;
		CelsiusAtEight = (temperatureAtEight - 32) * 5/9;
		System.out.println(temperatureAtEight + " degrees fahrenheit is " + CelsiusAtEight + " degrees celsius.");
	}
	
	public static void FahrenheitToCelsius2(double temperatureAtTwelve) {
		double CelsiusAtTwelve;
		CelsiusAtTwelve = (temperatureAtTwelve - 32) * 5/9;
		System.out.println(temperatureAtTwelve + " degrees fahrenheit is " + CelsiusAtTwelve + " degrees celsius.");
	}
	
	public static void FahrenheitToCelsius3(double temperatureAtFive) {
		double CelsiusAtFive;
		CelsiusAtFive = (temperatureAtFive - 32) * 5/9;
		System.out.println(temperatureAtFive + " degrees fahrenheit is " + CelsiusAtFive + " degrees celsius.");
	}
}
