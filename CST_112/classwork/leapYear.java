package classwork;
import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = s.nextInt();
		s.close();
		
		if(((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0))
			System.out.println("The year " + year + " is a leap year.");	 //  (^_^)
		else																 //  \( )/
			System.out.println("The year " + year + " is not a leap year."); //   / \
	}
}
