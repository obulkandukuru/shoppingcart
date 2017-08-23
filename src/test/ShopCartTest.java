package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.cart.ProductItem;
import main.cart.ShopCart;




public class ShopCartTest {
	private ShopCart shopCart;
	private ProductItem unitItem, unitItem1, unitItem2,unitItem3,unitItem4,unitItem5;

	@Before
	public void init() {
		shopCart = new ShopCart();
		unitItem = new ProductItem.ItemBuilder(ProductItem.Name.ORANGE)
				.unitPrice(0.25).createProduct();
		unitItem1 = new ProductItem.ItemBuilder(ProductItem.Name.ORANGE)
				.unitPrice(0.25).createProduct();
		unitItem2 = new ProductItem.ItemBuilder(ProductItem.Name.APPLE)
				.unitPrice(0.6).createProduct();
		unitItem3 = new ProductItem.ItemBuilder(ProductItem.Name.APPLE)
		.unitPrice(0.6).createProduct();
		unitItem4 = new ProductItem.ItemBuilder(ProductItem.Name.ORANGE)
		.unitPrice(0.25).createProduct();
		unitItem5 = new ProductItem.ItemBuilder(ProductItem.Name.APPLE)
		.unitPrice(0.6).createProduct();
	}

	@Test
	public void testIfShopCartEmpty() {
		Assert.assertEquals(0, shopCart.getItemCount());
	}

	@Test
	public void testGetTotalPrice() {
		shopCart.addItemToCart(unitItem);
		shopCart.addItemToCart(unitItem1);
		shopCart.addItemToCart(unitItem2);
		Assert.assertEquals(1.1, shopCart.getTotalPrice(), 0);

	}

	@Test
	public void testAddUnitItemToCart() {
		shopCart.addItemToCart(unitItem);
		shopCart.addItemToCart(unitItem1);
		shopCart.addItemToCart(unitItem2);
		Assert.assertEquals(3.0, shopCart.getItemCount(), 0);

	}
		
	
}