public class SellStock implements Order {
	private Stock mAbcStock;

	public SellStock(Stock abcStock) {
		this.mAbcStock = abcStock;
	}

	@Override
	public void execute() {
		mAbcStock.sell();
	}
}
