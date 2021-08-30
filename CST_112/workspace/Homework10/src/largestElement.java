import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of rows for the array: ");
		int row = scan.nextInt();
		System.out.print("Enter the number of columns for the array: ");
		int col = scan.nextInt();

		double[][] array = new double[row][col];

		System.out.println("Enter the numbers of the array: ");

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				array[i][j] = scan.nextDouble();

		int[] loc = locateLargest(array);

		System.out.println("The location of the largest element is " + loc[0]
				+ "," + loc[1]);

		scan.close();
	}

	public static int[] locateLargest(double[][] a) {
		double largest = 0;
		int[] loc = new int[2];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					loc[0] = i + 1;
					loc[1] = j + 1;
				}
			}
		return loc;
	}
}
