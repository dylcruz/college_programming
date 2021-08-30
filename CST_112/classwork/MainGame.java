import java.util.Scanner;
public class MainGame
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String h;
        String str;
        RPSGame human = new RPSGame();
        
        String playAgain = "Y";
        while(playAgain.equals("Y") || playAgain.equals("y"))
        {
            h = human.humanTakesTurn();
            human.play(h);
            
            System.out.print("Play again? (Y)es or (N)o. ");
            playAgain = scan.next();
        }
        str = human.getGameResults();
        System.out.println(str);
        
        scan.close();
    }
}