import java.util.Scanner;
public class bmi {
	public static void main (String[] args){
		double height, weight, bmi, weightKg, heightM;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds (lbs.): ");
		weight = s.nextDouble();
		weightKg = weight * 0.45359237;
		
		
		System.out.print("Enter you height in inches: ");
		height = s.nextDouble();
		heightM = height *  0.0254;
		
		s.close();
		
		bmi = (weightKg / Math.pow(heightM,2));
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