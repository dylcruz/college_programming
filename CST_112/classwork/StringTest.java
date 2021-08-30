package wejhfiwjei;

public class StringTest {

	public static void main(String[] args) {
		
			String s1 = "Hi Mary";
			String s2 = "Yo - Hi mary";
			
			if(s1.equals(s2))
				System.out.println("The strings are the same.");
			
			if(s1.equalsIgnoreCase(s2))
				System.out.println("The strings are same when we ignore case.");
			
			if (s1.substring(0,3).equals(s2.substring(5,8)))
				System.out.println("Both strings have this substring.");
			
			if(s1.endsWith("Mary") && s2.endsWith("Mary"))
				System.out.println("The strings end with the same thing.");
			
			
			
			//System.out.println("The string is:" + s1.trim().toLowerCase().toUpperCase());
			
			//System.out.println(s1.trim().charAt(3));
			
			 
	}
}
