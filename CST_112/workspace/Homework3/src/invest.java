import java.util.Scanner;
public class invest {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your investment amount: $");
		double invest = s.nextDouble();
		
		System.out.print("Enter your annual interest rate: %");
		double apr = (s.nextDouble() / 100);
		double mpr = apr / 12;
		
		System.out.print("Enter the number of years: ");
		double years = s.nextDouble();
		
		s.close();
		
		double investValue = (invest * Math.pow(1 + mpr,years * 12));
		
		System.out.println("Your accumulated value over " + years + " years is " + investValue);
	}

}
