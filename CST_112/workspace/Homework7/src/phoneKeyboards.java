import java.util.Scanner;
public class phoneKeyboards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.next();
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++){
			char x = s.charAt(i);
			if(Character.isLetter(x))
				System.out.print(getNumber(x));
			else
				System.out.print(x);
		}
		scan.close();
	}
	
	public static int getNumber(char uppercaseLetter){
		if(uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
			return 2;
		else if(uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
			return 3;
		else if(uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
			return 4;
		else if(uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
			return 5;
		else if(uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
			return 6;
		else if(uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
			return 7;
		else if(uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
			return 8;
		else
			return 9;
	}
}
