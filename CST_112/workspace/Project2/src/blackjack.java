import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class blackjack {

	public static void main(String[] args) {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		ArrayList<String> dHand = new ArrayList<String>();
		ArrayList<String> pHand = new ArrayList<String>();

		System.out.println("Welcome to Simple Blackjack!");
		System.out.println();

		// Mechanism to get a card from array and replace with empty value
		// If the card it chooses has been picked already, it chooses another
		int d = r.nextInt(13);
		dHand.add(cards[d]);
		System.out.println("Dealer drew a " + cards[d]);
		cards[d] = "";

		int p = r.nextInt(13);
		while (cards[p].equals(""))
			p = r.nextInt(13);
		pHand.add(cards[p]);
		System.out.println("You drew a " + cards[p]);
		cards[p] = "";

		p = r.nextInt(13);
		while (cards[p].equals(""))
			p = r.nextInt(13);
		pHand.add(cards[p]);
		System.out.println("You drew a " + cards[p]);
		cards[p] = "";

		System.out.println();

		// Shows dealer and player hand + sum of hand. Repeated through program
		// to give updates to player
		System.out.println("Dealer: " + dHand + "(" + getHandSum(dHand) + ")");
		System.out.println("You: " + pHand + "(" + getHandSum(pHand) + ")");

		System.out.println("Would you like to (H)it or (S)tay?");
		String selection = s.next().toUpperCase();

		// Players turn if they want to hit
		while (selection.equals("H")) {
			p = r.nextInt(13);
			while (cards[p].equals(""))
				p = r.nextInt(13);
			pHand.add(cards[p]);
			System.out.println("You drew a " + cards[p]);
			cards[p] = "";

			System.out.println("Dealer: " + dHand + "(" + getHandSum(dHand) + ")");
			System.out.println("You: " + pHand + "(" + getHandSum(pHand) + ")");
			System.out.println();

			if (getHandSum(pHand) > 21) {
				System.out.println("You bust, sorry!");
				s.close();
				return;
			}

			System.out.println("Would you like to (H)it or (S)tay?");
			selection = s.next().toUpperCase();
		}

		System.out.println("Dealers Turn");
		System.out.println();

		// Dealer gets cards until hand sum >= 17 or he busts
		while (getHandSum(dHand) < 17) {
			d = r.nextInt(13);
			while (cards[d].equals(""))
				d = r.nextInt(13);
			dHand.add(cards[d]);
			System.out.println("Dealer drew a " + cards[d]);
			cards[d] = "";

			System.out.println();

			System.out.println("Dealer: " + dHand + "(" + getHandSum(dHand) + ")");
			System.out.println("You: " + pHand + "(" + getHandSum(pHand) + ")");
			System.out.println();

			if (getHandSum(dHand) > 21) {
				System.out.println("Dealer bust, you win!");
				s.close();
				return;
			}
		}

		if (getHandSum(dHand) > getHandSum(pHand))
			System.out.println("Dealer has more points, you lose!");
		else if (getHandSum(dHand) < getHandSum(pHand))
			System.out.println("Player has more points, you win!");
		else
			System.out.println("Player and dealer have same points, push!");

		s.close();
	}

	// Computes the sum of a hand. If it detects an ace will cause a bust, it
	// will set its value to 1.
	public static int getHandSum(ArrayList<String> list) {
		int sum = 0;
		boolean ace = false;
		for (int i = 0; i < list.size(); i++) {
			sum += getCardValue(list.get(i));
			if (list.get(i).equals("A"))
				ace = true;
		}
		if (sum > 21 && ace)
			sum -= 10;

		return sum;
	}

	// Returns value of card
	public static int getCardValue(String card) {
		if (card.equals("2"))
			return 2;
		if (card.equals("3"))
			return 3;
		if (card.equals("4"))
			return 4;
		if (card.equals("5"))
			return 5;
		if (card.equals("6"))
			return 6;
		if (card.equals("7"))
			return 7;
		if (card.equals("8"))
			return 8;
		if (card.equals("9"))
			return 9;
		if (card.equals("A"))
			return 11;
		else
			return 10;
	}
}
