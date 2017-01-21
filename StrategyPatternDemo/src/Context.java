public class Context {
	private Strategy mStrategy;

	public Context(Strategy strategy) {
		this.mStrategy = strategy;
	}

	public int doStrategy(int num1, int num2) {
		return mStrategy.doAction(num1, num2);
	}
}