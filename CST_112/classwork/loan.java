import java.util.Scanner;

public class loan {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your loan amount: $");
		double loan = s.nextDouble();
		
		System.out.print("Enter your yearly interest rate: %");
		double apr = (s.nextDouble() / 100);
		double mpr = apr / 12;
		
		System.out.print("Enter the number of years: ");
		double years = s.nextDouble();
		
		double payment = monthlyPayment(loan, mpr, years);
		
		s.close();
		
		System.out.println("Your monthly payment is: $" + payment);
		
		double totalPayment = payment * (years * 12);
		System.out.print("Your total payment will be: $" + totalPayment);
		
	}

	public static double monthlyPayment(double loan, double rate, double years){
		double payment = ((loan * rate)/(1-(1/(Math.pow(1+rate,years*12)))));
		return payment;
	}
}
