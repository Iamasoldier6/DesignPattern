public class EagerSingletonSafe {
	private static EagerSingletonSafe instance = new EagerSingletonSafe();

	private EagerSingletonSafe() {

	}

	public static EagerSingletonSafe getInstance() {
		return instance;
	}
}
