
public class overloads {

	public static int max(int a, int b){
		if(a > b) return a;
		return b;
	}
	
	public static double max(double a, double b){
		if(a > b) return a;
		return b;
	}
	
	public static String max(String a, String b){
		if(a.compareTo(b) > 0) return a;
		return b;
	}
		
	public static void main(String[] args) {
		
		int m = max(3, 4);
		System.out.println(m);
		
		double x = max(7.5, 4.2);
		System.out.println(x);
		
		String s = max("Hello", "Dolly");
		System.out.println(s);
		
	}

}
