public class Homework2 {
	public static void main(String[] args){
		java();
		System.out.println();
		System.out.println("Appoximation of PI:");
		pi();
		System.out.println();
		System.out.println("Estimated population for the next 5 years:");
		population();
	}
	
	public static void java(){
		System.out.println("   J    A    V     V     A");
		System.out.println("   J   A A    V   V     A A");
		System.out.println("J  J  AAAAA    V V     AAAAA");
		System.out.println(" JJ  A     A    V     A     A");
	}
	
	public static void pi(){
		double x = 4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
		double y = 4*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void population(){
		double bpy = (31536000.0 / 7);
		double dpy = (31536000.0 / 13);
		double ipy = (31536000.0 / 45);
		double pop = 312032486;
		
		for(int i = 0; i < 5; i++){
			pop = pop + ((bpy + ipy) - dpy);
			System.out.println(pop);
		}
	}
}