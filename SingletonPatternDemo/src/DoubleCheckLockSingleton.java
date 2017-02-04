public class DoubleCheckLockSingleton {
	private volatile static DoubleCheckLockSingleton instance;

	private DoubleCheckLockSingleton() {

	}

	public static DoubleCheckLockSingleton getSingleton() {
		if (instance == null) {
			synchronized (DoubleCheckLockSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLockSingleton();
				}
			}
		}
		return instance;
	}
}
