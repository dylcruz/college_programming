package classwork;
import java.util.Random;
public class HundredRandom {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] nums = new int[100];
		
		for(int i = 0; i < 100; i++){
			int x = r.nextInt(100) + 1;
			nums[i] = x;
		}
		
		int sum = 0;
		double average = 0;
		
		for(int i = 0; i < nums.length - 1; i++) sum = sum + nums[i];
		
		average = sum / 100.0;
		System.out.println(average);
	}
	
	
}
