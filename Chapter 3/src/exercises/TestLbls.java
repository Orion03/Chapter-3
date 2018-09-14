package exercises;

import java.util.Scanner;

public class TestLbls {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double pounds;
		
		System.out.println("How many pounds do you weigh >> ");
		pounds = input.nextDouble();
		
		poundsToKilograms(pounds);
		poundsToOunces(pounds);
		poundsToMilligrams(pounds);

	}
	
	public static void poundsToKilograms(double pounds) {
		
		double poundsConversion1;
		poundsConversion1 = pounds * 0.453592;
		System.out.println("You weigh " + poundsConversion1 + " kilograms.");
		
		All(pounds, poundsConversion1);
	}
	
	public static void poundsToOunces(double pounds) {
		
		double poundsConversion2;
		poundsConversion2 = pounds * 16;
		System.out.println("You weigh " + poundsConversion2 + " ounces.");
		
		All(pounds, poundsConversion2);
	}
	
	public static void poundsToMilligrams(double pounds) {
		
		double poundsConversion3;
		poundsConversion3 = pounds * 453592.37;
		System.out.println("You weigh " + poundsConversion3 + " milligrams.");
		
		All(pounds, poundsConversion3);
	}
	
	public static void all(double pounds, double)
}
