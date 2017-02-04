public class LazySingletonNotSafe {
	private static LazySingletonNotSafe instance;

	private LazySingletonNotSafe() {

	}

	public static LazySingletonNotSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonNotSafe();
		}
		return instance;
	}
}
