import java.util.Scanner;
public class randomCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length for a random word: ");
		int x = scan.nextInt();
		scan.close();
		
		System.out.println(getRandomWord(x));
	}
	
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static String getRandomWord(int length){
		String s = "";
		for(int i = 0; i < length; i++){
			s += getRandomAlphabetCharacter();
		}
		return s;
	}

	public static char getRandomAlphabetCharacter(){
		return getRandomCharacter('A','z');
	}
}
