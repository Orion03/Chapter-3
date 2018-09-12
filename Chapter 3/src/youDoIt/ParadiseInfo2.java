package youDoIt;

import java.util.Scanner;

public class ParadiseInfo2
{

	public static void main(String[] args)
	{
		double price;
		double discount;
		double savings;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		
		displayInfo();
		
		savings = computeDiscountInfo(price, discount);
	}
	
	public static void displayInfo() {
		System.out.println("Paradise Day Spa will wants to pamper you.");
		System.out.println("We will make you look good.");
	}
}
