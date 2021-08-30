
public class tuition {

	public static void main(String[] args) {
		int endYear = 2016;
		double t = 3347.0;
		double nt = 3347.0;
		double change = 1.05;
		
		while(nt < (t * 2)){
			nt *= change;
			endYear++;
		}
		System.out.println("Tuition in " + endYear + " will be " + nt);
	}

}
