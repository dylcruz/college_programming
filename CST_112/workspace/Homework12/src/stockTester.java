public class stockTester {

	public static void main(String[] args) {
		stock orcl = new stock("ORCL", "Oracle Corportation", 34.5, 34.35);
		
		System.out.println("Percent change is " + orcl.getChangePercent() + "%");

	}

}
