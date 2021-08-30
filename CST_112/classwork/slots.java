import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class slots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slots
{
    int money;
    int plays;
    int wins;
    int loses;
    int moneyWon;
    int moneyLost;
    int net;
    int betTotal;
    public slots()
    {
        // Initialize instance variables
        money = 1000;
        plays = 0;
        wins = 0;
        loses = 0;
        moneyWon = 0;
        moneyLost = 0;
        betTotal = 0;
    }
    
    public void main()
    {
        int menuChoice = 0;
        
        while(menuChoice != 3)
        {
            menuChoice = menu();
            if(menuChoice == 1)
                game();
            if(menuChoice == 2)
                stats();
        }
    }
    
    public int menu()
    {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("***** Slot Machine *****");
        System.out.println("1. Play Slots");
        System.out.println("2. Stats.");
        System.out.println("3. Exit program.");
        choice = scan.nextInt();
        System.out.println("************************");
        return choice;
    }
    
    public void game()
    {
        Random gen = new Random();
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int r1c1 = gen.nextInt(4);
        int r1c2 = gen.nextInt(4);
        int r1c3 = gen.nextInt(4);
        int r2c1 = gen.nextInt(4);
        int r2c2 = gen.nextInt(4);
        int r2c3 = gen.nextInt(4);
        int r3c1 = gen.nextInt(4);
        int r3c2 = gen.nextInt(4);
        int r3c3 = gen.nextInt(4);
        
        int bet;
        boolean win3 = false;
        if(money < 1)
        {
            System.out.println("Sorry, you're out of money. You can't play.");
            return;
        }
        System.out.println("Current Money = $" + money);
        System.out.println("Place your bet.");
        System.out.print("Bet = $");
        bet = scan.nextInt();
        while(bet > money)
        {
            System.out.println("Sorry, you can't bet more than you have. Please bet lower.");
            System.out.println("Place your bet.");
            System.out.print("Bet = $");
            bet = scan.nextInt();
        }
        plays++;
        betTotal = betTotal + bet;
        System.out.println("Rolling the machine...");
        System.out.print(r1c1);
        System.out.print("\t");
        System.out.print(r1c2);
        System.out.print("\t");
        System.out.print(r1c3);
        System.out.println("");
        System.out.print(r2c1);
        System.out.print("\t");
        System.out.print(r2c2);
        System.out.print("\t");
        System.out.print(r2c3);
        System.out.println("");
        System.out.print(r3c1);
        System.out.print("\t");
        System.out.print(r3c2);
        System.out.print("\t");
        System.out.println(r3c3);
        
        //Row 1 wins & checks other rows
        if(r1c1 == r1c2 && r1c2 == r1c3)
        {
            if((r2c1 == r2c2 && r2c2 == r2c3) && (r3c1 == r3c2 && r3c2 == r3c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r2c1 == r2c2 && r2c2 == r2c3) || (r3c1 == r3c2 && r3c2 == r3c3)) && win3 == false)
            {
                System.out.println("Win on top row, and either middle or bottom! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on top row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        //Row 2 wins & checks other rows
        else if(r2c1 == r2c2 && r2c2 == r2c3)
        {
            if((r1c1 == r1c2 && r1c2 == r1c3) && (r3c1 == r3c2 && r3c2 == r3c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r1c1 == r1c2 && r1c2 == r1c3) || (r3c1 == r3c2 && r3c2 == r3c3)) && win3 == false)
            {
                System.out.println("Win on middle row, and either top or bottom! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on middle row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        //Row 3 wins & checks other rows
        else if(r3c1 == r3c2 && r3c2 == r3c3)
        {
            if((r2c1 == r2c2 && r2c2 == r2c3) && (r1c1 == r1c2 && r1c2 == r1c3))
            {
                System.out.println("Win on top, middle and bottom rows! Congrats! You win $" + (bet * 4));
                money = money + bet * 4;
                moneyWon = moneyWon + bet * 4;
                wins++;
                win3 = true;
            }
            else if(((r2c1 == r2c2 && r2c2 == r2c3) || (r1c1 == r1c2 && r1c2 == r1c3)) && win3 == false)
            {
                System.out.println("Win on bottom row, and either middle or top! Congrats! You win $" + (bet * 3));
                money = money + bet * 3;
                moneyWon = moneyWon + bet * 3;
                wins++;
            }
            
            else if(win3 == false)
            {
                System.out.println("Win on bottom row, congrats. You win $" + (bet * 2));
                money = money + bet * 2;
                moneyWon = moneyWon + bet * 2;
                wins++;
            }
        }
        else
        {
            System.out.println("You lose. No rows match.");
            money = money - bet;
            moneyLost = moneyLost + bet;
            loses++;
        }
    }
    
    public void stats()
    {
        net = moneyWon - moneyLost;
        System.out.println("Your stats so far this game...");
        System.out.println("Plays: " + plays);
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Money Won: $" + moneyWon);
        System.out.println("Money Lost: $" + moneyLost);
        System.out.println("Net: $" + net);
        System.out.println("Average bet: $" + (betTotal / plays));
    }
}