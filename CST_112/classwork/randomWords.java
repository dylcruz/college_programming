package classwork;
import java.util.Scanner;
import java.util.Random;

public class randomWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the length for a random word: ");
		int x = scan.nextInt();
		System.out.println(getRandomWord(x));
		
		System.out.print("Enter number of words for random sentence: ");
		int y = scan.nextInt();
		System.out.println(randomSentence(y));
		
		scan.close();
	}
	
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static String getRandomWord(int length){
		String s = "";
		for(int i = 0; i < length; i++) s += getRandomAlphabetCharacter();
		return s;
	}
	
	public static String randomSentence(int numWords){
		String s = "";
		Random r = new Random();
		int c = 0;
		for(int i = 0; i < numWords; i++){
			c = r.nextInt(6) + 2;
			s += getRandomWord(c);
			s += " ";
		}
		return s;
	}
	
	public static char getRandomAlphabetCharacter(){
		return getRandomCharacter('a','z');
	}
}
