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
		
		FahrenheitToCelsius(temperatureAtEight);
	}
	
	public static void FahrenheitToCelsius(double temperatureAtEight) {
		double CelsiusAtEight;
		CelsiusAtEight = (temperatureAtEight - 32) * 5/9;
		System.out.println(temperatureAtEight + " degrees fahrenheit is " + CelsiusAtEight + " degrees celsius.");
	}

}
