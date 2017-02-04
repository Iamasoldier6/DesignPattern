public class LazySingletonSafeSync {
	private static LazySingletonSafeSync instance;

	private LazySingletonSafeSync() {

	}

	public static synchronized LazySingletonSafeSync getInstance() {
		if (instance == null) {
			instance = new LazySingletonSafeSync();
		}
		return instance;
	}
}
