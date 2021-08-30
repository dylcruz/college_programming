import java.util.Random;
public class die {
	
	private int sides = 6;
	
	public die(int newSides){
		if(newSides > 1)
			sides = newSides;
		else
			System.out.println("Invalid number of sides, defaulting to 6.");
	}
	
	public static void main(String[] args) {
		die d = new die(6);
		System.out.println(d.roll());
		die d2 = new die(1);
		System.out.println(d2.roll());
	}

	public int roll(){
		Random r = new Random();
		int roll = r.nextInt(sides) + 1;
		return roll;
	}
}
