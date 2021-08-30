package classwork;
import java.util.Random;
import java.util.Scanner;
public class wordJumble {
	
	String[] words;
	
	public wordJumble(String[] words){
		this.words = words;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tries = 1;
		String[] words = {"hello", "goodbye", "test", "dylan"};
		
		wordJumble w = new wordJumble(words);
		
		String s = w.getRandomWord(words);
		String scram = w.scrambleWord(s);
		
		System.out.println("The scrambled word is: " + scram);
		System.out.print("Your guess: ");
		
		String guess = scan.next();
		while(!guess.equals(s)){
			tries++;
			System.out.print("Wrong. Guess again: ");
			guess = scan.next();
		}
		
		System.out.println("Correct! It took you " + tries + " tries to guess the word.");
		scan.close();
	}
	
	public String getRandomWord(String[] words){
		Random r = new Random();
		int x = r.nextInt(words.length);
		return words[x];
	}

	public String scrambleWord(String word){
		Random r = new Random();
		char a[] = word.toCharArray();
	    
		for( int i = 0; i < a.length; i++ )
	    {
	        int j = r.nextInt(a.length);
	        char temp = a[i]; 
	        a[i] = a[j]; 
	        a[j] = temp;
	    }       
	    return new String(a);
	}
}
