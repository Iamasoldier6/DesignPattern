public class OctalObserver extends CustomObserver {

	public OctalObserver(Subject subject) {
		mSubject = subject;
		mSubject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(mSubject.getState()));
	}

}
