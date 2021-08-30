import java.util.Random;

public class cards {

	public static void main(String[] args) {
		Random r = new Random();
		
		String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		
		int x = r.nextInt(cards.length);
		int y = r.nextInt(suits.length);
		
		System.out.println(cards[x] + " of " + suits[y]);
	}

}
