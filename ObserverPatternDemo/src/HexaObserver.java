public class HexaObserver extends CustomObserver {

	public HexaObserver(Subject subject) {
		mSubject = subject;
		mSubject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(mSubject.getState()).toUpperCase());
	}
}
