import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	
	public int[][] board = new int[4][4];
	public char[][] grid = new char[4][4];
	Random r = new Random();
	
	public NumberGame(){
		setup();
		play();
	}
	
	public void play(){
		boolean win = false;
		int row, col, row2, col2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Number Game!");
		while(!win){
			System.out.println("Your current board:");
			printGrid();
			System.out.print("Please select a row: ");
			row = scan.nextInt();
			System.out.print("Please select a column: ");
			col = scan.nextInt();
			grid[row][col] = (char) ((char) board[row][col] + '0');
			printGrid();
			System.out.print("Please select a row: ");
			row2 = scan.nextInt();
			System.out.print("Please select a column: ");
			col2 = scan.nextInt();
			grid[row2][col2] = (char) ((char) board[row2][col2] + '0');
			printGrid();
			if(board[row][col] == board[row2][col2]){
				grid[row2][col2] = (char) ((char) board[row2][col2] + '0');
				System.out.println("You got a match!");
			}
			else{
				grid[row][col] = 'x';
				grid[row2][col2] = 'x';
				System.out.println("No match.");
			}
			win = gameOver();
		}
		printGrid();
		System.out.println("You win!");
		scan.close();
	}
	
	public boolean gameOver(){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j] == 'x')
					return false;
			}
		}
		return true;
	}
	
	public void setup(){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++)
				board[i][j] = -1;
		}
		for(int i = 1; i < 9; i++){
			int row, col;
			row = r.nextInt(4);
			col = r.nextInt(4);
			for(int j = 0; j < 2; j++){
				while(board[row][col] != -1){
					row = r.nextInt(4);
					col = r.nextInt(4);
				}
				board[row][col] = i;
			}
		}
	
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++)
				grid[i][j] = 'x';
		}
	
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
	
	public void printGrid(){
		System.out.println("  0 " + "1 " + "2 " + "3");
		for(int i = 0; i < grid.length; i++){
			System.out.print(i + " ");
			for(int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new NumberGame();
	}

}
