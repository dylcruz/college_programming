import java.util.Scanner;
public class driving {

	public static void main(String[] args) {
		double distance, mpg, ppg, cost;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the driving distance in miles: ");
		distance = s.nextDouble();
		
		System.out.print("Enter the fuel efficiency of your car in miles per gallon: ");
		mpg = s.nextDouble();
		
		System.out.print("Enter the price of gas per gallon: ");
		ppg = s.nextDouble();
		
		s.close();
		
		cost = (distance / mpg) * ppg;
		
		System.out.println("The cost of driving " + distance + " miles is $" + cost);

	}
}
