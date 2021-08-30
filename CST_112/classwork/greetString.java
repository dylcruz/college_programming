import java.util.Scanner;
public class greetString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string to be greeted: ");
		String s = scan.nextLine();
		System.out.print("Enter the amount of times to be greeted: ");
		int x = scan.nextInt();
		scan.close();
		
		System.out.println(greetTimes(x,s));
		
	}

	public static String greet(String name){
		return "Hello " + name + ". ";
	}

	public static String greetTimes(int n, String name){
		String s = "";
		for(int i = 0; i < n; i++)
			s += greet(name);
		return s;
	}
}
