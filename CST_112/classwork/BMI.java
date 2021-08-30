package jgiowjtg;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args){
		double height, weight, bmi;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your weight in kilograms: ");
		weight = s.nextDouble();
		
		System.out.print("Enter you height in meters: ");
		height = s.nextDouble();
		
		s.close();
		
		bmi = (weight / Math.pow(height,2));
		System.out.println("Your BMI is: " + bmi);
		
		
		if(bmi < 18.5)
			System.out.println("You're underweight :|");
		else if (bmi < 25)
			System.out.println("You're normal weight :)");
		else if (bmi < 30)
			System.out.println("You're overweight :|");
		else
			System.out.println("You're obese :(");
	}
}