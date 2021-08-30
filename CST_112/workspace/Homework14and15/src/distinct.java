import java.util.ArrayList;
import java.util.Scanner;

public class distinct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 10 integers:");
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			ints.add(scan.nextInt());
		}
		
		removeDuplicates(ints);
		
		System.out.print("The distinct integers are: ");
		for(int i = 0; i < ints.size(); i++){
			System.out.print(ints.get(i) + " ");
		}
		
		scan.close();
	}

	public static void removeDuplicates(ArrayList <Integer> list){
		for(int i = 0; i < list.size(); i++){
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(i) == list.get(j)){
					list.remove(j);
				}
			}
		}
	}
}
