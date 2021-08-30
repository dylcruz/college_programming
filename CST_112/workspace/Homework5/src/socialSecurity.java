import java.util.Scanner;

public class socialSecurity {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean valid = true;
		System.out.print("Enter a SSN: ");
		String social = s.nextLine();
		s.close();
		
		if(social.length() != 11)
			valid = false;
		
		for(int i = 0; i < social.length(); i++){
			char ch = social.charAt(i);
            
			if (i == 3 && ch != '-') 
            	valid = false;
            if (i == 6 && ch != '-') 
            	valid = false;
            if (i != 6 && i != 3 && !Character.isDigit(ch))
            	valid = false;
		}
		
		if(valid == true)
			System.out.println(social + " is a valid social security number.");
		else
			System.out.println(social + " is an invalid social security number.");
	}

}
