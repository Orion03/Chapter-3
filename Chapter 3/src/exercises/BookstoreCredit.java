package exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double GPA;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your full name >> ");
		name = input.nextLine();
		
		System.out.println("What is your grade point average >> ");
		GPA = input.nextDouble();
		
		displayMessage(name, GPA);
	}
	
	public static void displayMessage(String name, double GPA) {
		
		double yourCredit;
		
		yourCredit = GPA * 10;
		
		System.out.println("Your name: " + name);
		System.out.println("Your GPA: " + GPA);
		System.out.println("Your total bookstore credit is $" + yourCredit + "!");
		
	}

}
