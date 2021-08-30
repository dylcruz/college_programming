package wejhfiwjei;

public class Ternary {

	public static void main(String[] args) {
		int y;
		int x = 5;
		int num = 6;
		
		if(x > 0)
			y = 1;
		else
			y = -1;
		
		y = (x > 0) ? 1 : -1;
		
		System.out.println(y);
		
		// Same thing
		
		if(num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
		
		System.out.println((num % 2 == 0) ? num + " is even" : num + " is odd");
		
		
		
	}

}
