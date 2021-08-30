
public class arrays {
	public static void main (String [] args){
		
		int [] oneDimension = {1,2,3,4};
		int [][] twoDimension = { {1,3}, {2,4} };
		
		for(int i = 0; i < oneDimension.length; i++){
			System.out.print(oneDimension[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < twoDimension.length; i++){
			for(int j = 0; j < twoDimension[i].length; j++){
				System.out.print(twoDimension[i][j] + " ");
			}
		}
		
		
	}
}
