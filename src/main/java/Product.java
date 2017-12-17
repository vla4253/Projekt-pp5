
public class Product {
	private String name;
	private int quantity;

	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void sell() throws OutOfStockException {
		if (quantity == 0) {
			throw new OutOfStockException();
		} else {
			quantity--;
		}

	}
}
