import java.util.Scanner;
public class letters {

	public static void main(String[] args) {
		int v = 0;
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String s = scan.nextLine();
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
				v++;
			else if(s.charAt(i) == ' ')
				continue;
			else
				c++;
		}
		
		System.out.println("The number of vowels is " + v);
		System.out.println("The number of consonants is " + c);
		
		scan.close();
	}
}
