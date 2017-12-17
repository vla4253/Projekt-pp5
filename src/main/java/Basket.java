import java.util.*;

public class Basket {
	HashMap<String, Integer> products = new HashMap<String, Integer>();

	public void add(Product product) throws Exception {

		product.sell();
		if (products.containsKey(product.getName())) {

			products.replace(product.getName(), (products.get(product.getName()) + 1));
		} else {

			products.put(product.getName(), 1);
		}

	}

	public int getProductsCount() {
		return products.size();
	}

	public int getProductCount(String product) {
		return products.get(product);
	}
}
