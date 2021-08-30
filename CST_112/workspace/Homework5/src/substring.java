import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string s1: ");
		String s1 = scan.nextLine();
		System.out.print("Enter string s2: ");
		String s2 = scan.nextLine();
		scan.close();
		
		if (s1.contains(s2))
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}
}
