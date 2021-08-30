package classwork;

import java.util.Scanner;

public class ArrayExamples {

	public static double sumOfRandoms(int entries){
		double[] nums = new double[entries];
		
		for(int i = 0; i < entries; i++) nums[i] = Math.random() * 100;
		
		double sum = 0.0;
		for(int i = 0; i < entries; i++) sum += nums[i];
		
		return sum;
	}
	
	
	public static void printUserEntries(int entries){
		Scanner scan = new Scanner(System.in);
		
		double[] userEntries = new double[entries];		
		for(int i = 0; i < entries; i++) userEntries[i] = scan.nextDouble();
		
		System.out.println(userEntries[entries - 2]);	
		scan.close();		
	}
	
	public static double sumUserEntries(int entries){
		Scanner scan = new Scanner(System.in);
		
		double[] userEntries = new double[entries];		
		for(int i = 0; i < entries; i++) userEntries[i] = scan.nextDouble();
		
		double sum = 0.0;
		for(int i = 0; i < entries; i++) sum += userEntries[i];
			
		scan.close();	
		return sum;
	}
	
	public static double avgUserEntries(int entries){
		double sum = sumUserEntries(entries);
		return (sum/entries);
	}
	
	public static void main(String[] args) {
		
		/*printUserEntries(5);
		
		double sum = sumOfRandoms(3);
		System.out.println(sum);
		
		double[] grades = new double[20];
		
		grades[9] = 75.5;
		
		System.out.println(grades[8]);
		System.out.println(grades[9]);
		System.out.println(grades[10]);
		
		grades[9] = 82.5;
		System.out.println(grades[9]);*/
		
		double[] heights = {2.0,1.5,2.3};
		for(double height: heights) System.out.println(height);
		
	
		}
		
	}