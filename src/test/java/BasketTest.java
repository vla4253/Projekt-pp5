import org.junit.Test;
import org.junit.Assert;

public class BasketTest {
	@Test
	public void checkAllowToAddProductToBasket() {
		Product p1 = new Product("produkt 1", 10);
		Basket basket = new Basket();
		try {
			basket.add(p1);
			Assert.assertTrue(basket.getProductsCount() == 1);
		} catch (Exception err) {

		}

	}

	@Test
	public void checkAllowToAddSameProductsToBasket() {
		Product p1 = new Product("produkt 1", 10);
		Basket basket = new Basket();

		try {
			basket.add(p1);
			basket.add(p1);
			basket.add(p1);
			Assert.assertTrue(basket.getProductCount("produkt 1") == 3);
		} catch (Exception err) {

		}

	}

	@Test
	public void checkAllowToAddDifferentProductsToBasket() {
		Product p1 = new Product("produkt 1", 10);
		Product p2 = new Product("produkt 2", 10);
		Product p3 = new Product("produkt 3", 10);
		Basket basket = new Basket();
		try {
			basket.add(p1);
			basket.add(p2);
			basket.add(p3);
			Assert.assertTrue(basket.getProductsCount() == 3);
		} catch (Exception err) {

		}
	}

	@Test
	public void checkOutOfStock() {
		Product p1 = new Product("produkt 1", 0);

		Basket basket = new Basket();

		try {
			basket.add(p1);
			Assert.fail();
		} catch (Exception err) {
			Assert.assertTrue(true);
		}
	}

}
