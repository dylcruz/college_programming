package classwork;
import java.util.Scanner;
public class zodiac {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the year you were born: ");
		
		int year = s.nextInt();
		s.close();
		
		switch(year % 12){
		case 0: 
			System.out.println("You were born in the year of the monkey");
			break;
		case 1:
			System.out.println("You were born in the year of the Rooster");
			break;
		case 2:
			System.out.println("You were born in the year of the Dog");
			break;
		default:
			System.out.println("Some other zodiac");
		}
	}
}
