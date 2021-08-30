import java.util.Scanner;
public class divisible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		if(divisible3(n))
			System.out.println("The number is divisible by 3.");
		if(divisible4(n))
			System.out.println("The number is divisible by 4.");
		if(divisible3And4(n))
			System.out.println("The bumber is divisible by 3 and 4");
	}

	public static boolean divisible3(int x){
		if(x % 3 == 0)
			return true;
		else
			return false;
	}

	public static boolean divisible4(int x){
		if(x % 4 == 0)
			return true;
		else
			return false;
	}

	public static boolean divisible3And4(int x){
		if((x % 4 == 0) && (x % 3 == 0))
			return true;
		else
			return false;
	}
}
