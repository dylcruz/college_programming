import java.util.ArrayList;

public class VendingMachine {

	ArrayList<Product> products = new ArrayList<Product>();
	double cash;

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Soda Pepsi = new Soda("A1", 10, 2.00, "Pepsi", 24);
		Candy Kitkat = new Candy("B1", 8, 1.50, "Kit Kat");
		Candy Hershey = new Candy("B2", 1, 1.50, "Hershey Bar");

		vm.addNewProduct(Pepsi);
		vm.addNewProduct(Kitkat);
		vm.addNewProduct(Hershey);

		vm.addMoney(10);

		vm.printProducts();

		vm.vend("A1");
		vm.vend("B1");
		vm.vend("B2");
		vm.printProducts();
		vm.vend("B2");
		vm.vend("X");

	}

	public void vend(String pid) {
		int x = -1;
		boolean found = false;
		for (int i = 0; i < products.size(); i++) {
			if (pid.equals(products.get(i).getProductID())) {
				x = i;
				found = true;
			}
		}

		if (!found) {
			System.out.println("Invalid ID.");
			return;
		}

		if (products.get(x).getQuantity() < 1) {
			System.out.println("This prouduct is sold out.");
			return;
		}

		if (this.cash < products.get(x).getPrice()) {
			System.out.println("You don't have enough money for this product.");
			return;
		}

		this.cash -= products.get(x).getPrice();
		products.get(x).remove();
		System.out.println("Dispensing " + products.get(x).getName());
		System.out.println("You have $" + this.cash);
	}

	public void addMoney(double money) {
		this.cash += money;
	}

	public void printProducts() {

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getQuantity() > 0)
				System.out.println(products.get(i).getProductID() + " | "
						+ products.get(i).getName() + " | "
						+ products.get(i).getPrice());
		}
	}

	public void addNewProduct(Product p) {
		products.add(p);
	}
}
