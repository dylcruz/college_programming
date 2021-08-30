
public class Soda extends Product {

	private double volume;
	
	public Soda(String productID, int quantity, double price, String name, double volume) {
		super(productID, quantity, price, name);
		this.volume = volume;
	}
	
	public double getCostPerOunce(){
		return (this.volume / this.getPrice());
	}
}
