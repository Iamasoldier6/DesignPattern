public class BuyStock implements Order {
	private Stock mAbcStock;

	public BuyStock(Stock abcStock) {
		this.mAbcStock = abcStock;
	}

	@Override
	public void execute() {
		mAbcStock.buy();
	}
}
