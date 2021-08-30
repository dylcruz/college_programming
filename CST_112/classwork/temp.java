import java.util.Scanner;

public class temp {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		double y = scan.nextDouble();
		
		System.out.println("1. F To C");
		System.out.println("2. C To F");
		int x = scan.nextInt();
		scan.close();
		
		if(x == 1)
			System.out.println(fToC(y));
		if(x == 2)
			System.out.println(cToF(y));
		else
			return;
	}
	
	public static double fToC(double f){
		double c;
		c = (5.0/9.0)*(f-32);
		return c;
	}

	public static double cToF(double c){
		double f;
		f = (9.0/5.0)*c+32;
		return f;
	}
}
