import java.util.Scanner;
public class smallestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		double[] doubleArray = new double[10];
		for(int i = 0; i < doubleArray.length; i++) doubleArray[i] = scan.nextDouble();
		
		System.out.println("The minimum number is: " + min(doubleArray));
		
		scan.close();
	}

	public static double min(double[] array){
		double min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}
