import java.util.Scanner;
public class stringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string to be reversed: ");
		String str = scan.next();
		System.out.println(reverse(str));
		
		System.out.print("Enter a string to be reversed strongly: ");
		str = scan.next();
		System.out.println(reverseStrongly(str));
		
		scan.close();
		
	}
	
	public static String reverse(String s){		
		String r = "";
		for(int i = s.length(); i > 0; i--) r += s.charAt(i-1);
		return r;
	}	
	
	public static String reverseStrongly(String s){		
		return "¡"+reverse(s).toUpperCase()+"!";
	}
	
	public static String reverse2(String s){
		return new StringBuffer(s).reverse().toString();
	}
}
