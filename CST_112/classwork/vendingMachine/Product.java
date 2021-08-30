
public class Product {
	
	private String productID;
	private int quantity;
	private double price;
	private String name;
	
	public Product(String productID, int quantity, double price, String name){
		this.productID = productID;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}

	public String getProductID() {
		return productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void remove(){
		this.quantity -= 1;
	}
}
