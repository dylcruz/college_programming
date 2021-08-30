package classwork;
import java.util.Scanner;

public class tuitionChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a starting year: ");
		int sy = scan.nextInt();
		
		System.out.print("Enter the current tuition: ");
		double t = scan.nextDouble();
		
		System.out.print("Enter the yearly change in tuition in percent (5%): " );
		double change = scan.nextDouble();
		change = ((change / 100) + 1);
		
		int yd = yearDoubled(sy,t,change);
		System.out.println("The tuition will be doubled in the year " + yd + ".");
		
		scan.close();
	}

	public static int yearDoubled(int startYear, double t, double change){
		int endYear = startYear;
		double nt = t;
		while (nt < (t * 2)) {
			nt *= change;
			endYear++;
		}
		return endYear;
	}
}