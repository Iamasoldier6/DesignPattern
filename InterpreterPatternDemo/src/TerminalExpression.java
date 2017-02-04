public class TerminalExpression implements Expression {

	private String mData;

	public TerminalExpression(String data) {
		this.mData = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(mData)) {
			return true;
		}
		return false;
	}
}
