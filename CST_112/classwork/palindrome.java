import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word to check if it's an palindrome: ");
		String s = scan.next();
		scan.close();
		
		if(isPalindrome(s))
			System.out.println("The word " + s + " is a palindrome.");
		else
			System.out.println("The word " + s + " is not a palindrome.");

	}

	public static boolean isPalindrome(String pal){
		pal = pal.toUpperCase();
		for(int i = 0; i < (pal.length() / 2); i++){
			if(pal.charAt(i) != pal.charAt((pal.length() - 1) - i))
				return false;
		}
		return true;
	}
}
