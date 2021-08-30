import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String letter = s.nextLine();
		
		while(letter.length() != 1){
			System.out.println("Please enter one letter.");
			System.out.print("Enter a letter: ");
			letter = s.nextLine();
		}
		s.close();
		
		char c = Character.toUpperCase(letter.charAt(0));
		
		if(c > 'Z' || c < 'A')
			System.out.println(letter + " is an invalid input.");
		else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			System.out.println(letter + " is a vowel.");
		else
			System.out.println(letter + " is a consonant.");
	}

}
