package classwork;
import java.util.Scanner;
public class booleanOps {	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = s.nextInt();
		s.close();
		
		if((x % 3 == 0) && (x % 2 == 0))
			System.out.println("The number " + x + " is divisible by 2 and 3.");
		if((x % 3 == 0) || (x % 2 == 0))
			System.out.println("The number " + x + " is divisible by 2 or 3.");
		if((x % 3 == 0) ^ (x % 2 == 0))
			System.out.println("The number " + x + " is divisible by 2 or 3, but not both.");
	}
}