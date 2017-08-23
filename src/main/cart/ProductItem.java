package main.cart;
public class ProductItem {

	private Double unitPrice;

	public enum Name {
		ORANGE, APPLE
	}

	public ProductItem(Name orange, Double unitPrice) {
		this.itemtype = orange;
		this.unitPrice = unitPrice;
	}

	Name itemtype;

	/**
	 * @return the itemtype
	 */
	public Name getItemtype() {
		return itemtype;
	}

	/**
	 * @param itemtype
	 *            the itemtype to set
	 */
	public void setItemtype(Name itemtype) {
		this.itemtype = itemtype;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return unitPrice;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.unitPrice = price;
	}

	public static class ItemBuilder {
		Name itemtype;
		private Double unitPrice;

		public ItemBuilder(Name itemtype) {
			this.itemtype = itemtype;
		}
		public ItemBuilder unitPrice(Double unitPrice) {
			this.unitPrice = unitPrice;
			return this;
		}

		public ProductItem createProduct() {
			return new ProductItem(itemtype, unitPrice);
		}

	}
}