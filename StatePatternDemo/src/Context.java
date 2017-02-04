public class Context {
	private State mState;

	public Context() {
		mState = null;
	}

	public void setState(State state) {
		this.mState = state;
	}

	public State getState() {
		return mState;
	}
}
