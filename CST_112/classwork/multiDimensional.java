public class multiDimensional {
	
	public static int[][] makeTimesTable(int start, int end) {
		int[][] timesTable = new int[(end - start) + 1][(end - start) + 1];

		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++)
				timesTable[i - start][j - start] = i * j;
		}
		return timesTable;

	}

	public static void printTimesTable(int[][] timesTable) {
		for (int row = 0; row < timesTable.length; row++) {
			for (int col = 0; col < timesTable[row].length; col++)
				System.out.print(timesTable[row][col] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] timesTable = makeTimesTable(1,9);
		// System.out.println(timesTable[0][3]);
		printTimesTable(timesTable);
	}

}
