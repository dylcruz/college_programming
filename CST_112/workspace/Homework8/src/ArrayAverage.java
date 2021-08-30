import java.util.Scanner;
public class ArrayAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 ints: ");
		
		int[] intArray = new int[10];
		for(int i = 0; i < intArray.length; i++) intArray[i] = scan.nextInt();
		
		System.out.println(average(intArray));
		
		System.out.println("Enter 10 doubles: ");
		
		double[] doubleArray = new double[10];
		for(int i = 0; i < doubleArray.length; i++) doubleArray[i] = scan.nextDouble();
		
		System.out.println(average(doubleArray));
		scan.close();
	}

	public static int average(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++) sum += array[i];
		return sum / array.length;	
	}

	public static double average(double[] array){
		double sum = 0.0;
		for(int i = 0; i < array.length; i++) sum += array[i];
		return sum / array.length;	
	}
}
