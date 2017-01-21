public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new ActionAdd());
		System.out.println("10 + 5 = " + context.doStrategy(10, 5));

		context = new Context(new ActionSubstract());
		System.out.println("10 - 5 = " + context.doStrategy(10, 5));

		context = new Context(new ActionMultiply());
		System.out.println("10 x 5 = " + context.doStrategy(10, 5));
	}
}