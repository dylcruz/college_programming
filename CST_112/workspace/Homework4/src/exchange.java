import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the conversion rate from dollars to RMB: ");
		double rate = s.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = s.nextInt();
		
		while(choice != 0 && choice != 1){
			System.out.println("Please enter a valid number");
			System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
			choice = s.nextInt();
		}
				
		if(choice == 0){
			System.out.print("Enter dollar amount: ");
			double x = s.nextDouble();
			double y = x * rate;
			System.out.println("$" + x + " is " + y + " yuan");
		}
		if(choice == 1){
			System.out.print("Enter RMB amount: ");
			double x = s.nextDouble();
			double y = x / rate;
			System.out.println(x + " yuan " + " is " + "$" + y);
		}
		s.close();
		
	}

}
