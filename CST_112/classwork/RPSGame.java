import java.util.Random;
import java.util.Scanner;

public class RPSGame
{
    private int computerWins;
    private int humanWins;
    private int ties;
    private int plays;
    
    public RPSGame(){
        plays = 0;
        ties = 0;
        humanWins = 0;
        computerWins = 0;
    }

    public String humanTakesTurn(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors: The Game");
		System.out.println("Please Choose:");
		System.out.println("(R)ock");
		System.out.println("(P)aper");
		System.out.println("(S)cissors");	
		System.out.print("My Choice: ");
		String mySelection = scan.next();
		
		mySelection = mySelection.toUpperCase();
		
		while(!mySelection.equals("R") && !mySelection.equals("P") && !mySelection.equals("S")){
			System.out.println("Please choose a valid selection.");
			mySelection = scan.next();
			mySelection = mySelection.toUpperCase();
		}
		return mySelection;
    }

    public String computerTakesTurn(){
		Random r = new Random();
		int c = r.nextInt(3) + 1;
		if(c == 1)
			return "R";
		else if(c == 2)
			return "P";
		else
			return "S";
	}
    
    public void play(String h){
        
        String c = computerTakesTurn();
        
        if(h.equals("R") && c.equals("S")){
            humanWins++;
            System.out.println("You chose Rock. Computer chose Scissors. You win!");
        }
        if(h.equals("R") && c.equals("P")){
            computerWins++;
            System.out.println("You chose Rock. Computer chose Paper. You lose!");
        }
        if(h.equals("P") && c.equals("S")){
            computerWins++;
            System.out.println("You chose Paper. Computer chose Scissors. You lose!");
        }
        if(h.equals("P") && c.equals("R")){
            humanWins++;
            System.out.println("You chose Paper. Computer chose Rock. You win!");
        }
        if(h.equals("S") && c.equals("P")){
            humanWins++;
            System.out.println("You chose Scissors. Computer chose Paper. You win!");
        }
        if(h.equals("S") && c.equals("R")){
            computerWins++;
            System.out.println("You chose Scissors. Computer chose Rock. You lose!");
        }
        if(h.equals(c)){
            ties++;
            System.out.println("You and the computer chose the same. Tie!");
        }
        plays++;
    }

    public String getGameResults()
    {
        String results = "Human Wins: " + humanWins + "\nComputer Wins: " + computerWins + "\nTies: " + ties + "\nTotal Plays: " + plays;;
        return results;
    }
    
}