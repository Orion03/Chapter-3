package tutorial;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Demonstrating some raises");
		
		Scanner input = new Scanner(System.in);
		
		predictRaise(salary);
	}
	
	public static void predictRaise(double salary) {
		
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + "	After raise: " + newSalary);
	}

}
