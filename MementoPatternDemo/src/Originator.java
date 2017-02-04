public class Originator {
	private String mState;

	public String getState() {
		return mState;
	}

	public void setState(String state) {
		this.mState = state;
	}

	public Memento saveStateToMemento() {
		return new Memento(mState);
	}

	public void getStateFromMemento(Memento memento) {
		mState = memento.getState();
	}
}
