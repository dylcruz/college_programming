import java.util.Random;
public class montyHall {

	public static void main(String[] args) {
		Random r = new Random();
		
		final int it = 1000000;
		int wins = 0;
		
		for(int i = 0; i < it; i++){
			int guess = 1;
			int s = r.nextInt(3) + 1;
			int elim = 1;
			
			do{
				elim = r.nextInt(3) + 1;
			} while (elim == s || elim == guess); 
			
			if(elim == 2)
				guess = 3;
			else if(elim == 3)
				guess = 2;
			
			if(guess == s)
				wins++;
		}
		
		System.out.println("You were right " + ((wins /(double)it)*100) + " percent of the time.");
	}

}