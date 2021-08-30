import java.util.Scanner;

public class shipping {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please enter the weight of the package in pounds (lbs.): ");
		int w = s.nextInt();
		
		s.close();
		
		if(w > 0 && w <= 1)
			System.out.println("Shipping for the package costs $3.50");
		else if (w > 1 && w <= 3)
			System.out.println("Shipping for the package costs $5.50");
		else if (w > 3 && w <= 10)
			System.out.println("Shipping for the package costs $8.50");
		else if (w > 10 && w <= 20)
			System.out.println("Shipping for the package costs $10.50");
		else if (w > 50)
			System.out.println("The package cannot be shipped.");	
	}

}
