package main.cart;
import main.cart.ProductItem;
import main.cart.ProductItem.Name;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ShopCart {

	private List<ProductItem> finalCart = new ArrayList<>();

	/*
	 * getItemCount returns total count of items in the cart
	 */
	public int getItemCount() {
		if (finalCart.size() > 0) {
			return finalCart.size();
		}
		return 0;

	}
/*
 * Add unit item to cart
 */
	public void addItemToCart(ProductItem unitItem) {
		finalCart.add(unitItem);
	}

	/*
	 * getTotalPrice() returns total price of all the items in the list
	 */
	public Double getTotalPrice() {
		 // Create a Map to hold two lists of values by item type (ORANGE, APPLE)
		Map<ProductItem.Name, Double> totalbyItem = finalCart.stream().collect(
				Collectors.groupingBy(ProductItem::getItemtype, Collectors
						.reducing(0.0d, ProductItem::getPrice, Double::sum)));
         // Get total price of all items in the Map irrespective of item type
		Double sum = 0.0d;
		for (Double val : totalbyItem.values()) {
			sum += val;
		}
		return sum;
	}
	
}