package classwork;
import java.util.Scanner;

public class lottery {
	public static void main(String[] args){
		int lottery = (int)(Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		input.close();
		
		int lD1 = lottery / 10;
		int lD2 = lottery % 10;
		
		int gD1 = guess / 10;
		int gD2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if(guess == lottery)
			System.out.println("Exact match, you win $10,000.");
		else if(gD2 == lD1 && gD1 == lD2)
			System.out.println("Match all digits, you win $3,000.");
		else if(lD1 == gD1 || lD2 == gD1 || lD1 == gD2 || lD2 == gD2)
			System.out.println("Match one digit, you win $1,000.");
		else
			System.out.println("You're a loser.");
		
	}
}
