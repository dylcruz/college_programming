package classwork;
import java.util.Random;
import java.util.Date;

public class birthdayParadox {

	public static void main(String[] args) {
		double same = 0;
		
		for(int i = 0; i < 10000; i++){
			same += dateCheck();
		}
		
		System.out.println("There was a collision " + (same / 10000) * 100 + "% of the time.");
		
	}

	@SuppressWarnings("deprecation")
	public static int dateCheck(){
		Random r = new Random();
		boolean same = false;
		
		Date [] dates = new Date[23];
		
		for(int i = 0; i < dates.length; i++){
			dates[i] = new Date(1980,r.nextInt(12),r.nextInt(28) + 1);
		}
		
		for(int i = 0; i < dates.length; i++){
			for(int j = i + 1; j < dates.length; j++){
				if(dates[i].equals(dates[j]))
					same = true;
			}
		}
		
		if(same)
			return 1;
		else
			return 0;
	}
}
