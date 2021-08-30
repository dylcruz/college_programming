package project01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: Main Author: Dylan Cruz 
 * Course: CST141-SP17 
 * Due: March 4, 2017 (by
 * 11:59PM)
 *
 * Description: Menu system to interact with an array list of account objects
 */
public class atm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<account> accounts = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            accounts.add(new account(i,100));
        }

        while (true) {
            int loadedAccount = -1;
            System.out.print("Enter an ID: ");
            int idChoice = scan.nextInt();

            while (idChoice > accounts.size() - 1 || idChoice < 0) {
                System.out.println("Invalid ID, please choose again.");
                System.out.print("Enter an ID: ");
                idChoice = scan.nextInt();
            }

            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getId() == idChoice) {
                    loadedAccount = accounts.get(i).getId();
                }
            }

            int menuChoice = 0;
            while (menuChoice != 4) {
                double withdrawAmount;
                double depositAmount;

                System.out.println("Main Menu");
                System.out.println("1: Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter a choice: ");
                menuChoice = scan.nextInt();

                while (menuChoice < 1 || menuChoice > 4) {
                    System.out.println("Invalid choice, please choose again.");
                    System.out.println("Main Menu");
                    System.out.println("1: Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Enter a choice: ");
                    menuChoice = scan.nextInt();
                }

                if (menuChoice == 1) {
                    System.out.println("The balance is " + accounts.get(loadedAccount).getBalance());
                }

                if (menuChoice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    withdrawAmount = scan.nextDouble();
                    accounts.get(loadedAccount).withdraw(withdrawAmount);
                }

                if (menuChoice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    depositAmount = scan.nextDouble();
                    accounts.get(loadedAccount).deposit(depositAmount);
                }
                System.out.println();
            }
        }
    }
}
