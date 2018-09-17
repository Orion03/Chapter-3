package exercises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inches;
		double gallons;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of inches >> ");
		inches = input.nextDouble();
		
		System.out.println("Enter amount of gallons >> ");
		gallons = input.nextDouble();
		
		inchesToCentimeters(inches);
		gallonsToLiters(gallons);
		
	}
	
	public static void inchesToCentimeters(double inches) {
		
		double centimeters = 2.54;
		double conversion1 = inches * centimeters;
		
		System.out.println("Your total centimeters: " + conversion1);
	}
	
	public static void gallonsToLiters(double gallons) {
		
		double liters = 3.7854;
		double conversion2 = gallons * liters;
		
		System.out.println("Your total liters: " + conversion2);
	}

}
