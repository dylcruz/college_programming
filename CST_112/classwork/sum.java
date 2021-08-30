package classwork;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to start at: ");
		int x = scan.nextInt();
		System.out.print("Enter a number to end at: ");
		int y = scan.nextInt();
		
		while(y < x){
			System.out.println("The end number can't be smaller than the start.");
			System.out.print("Enter a number to end at: ");
			y = scan.nextInt();
		}
		
		int z = sumRange(x,y);
		System.out.println("The summation of the range " + x + " to " + y + " is " + z);
		scan.close();
	}

	public static int sumRange(int x, int y){
		int sum = 0;
		for(int i = x;i <= y; i++) sum += i;
		return sum;
	}

}
