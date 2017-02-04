public class RegisterSingleton {
	private static class SingletonHolder {
		private static final RegisterSingleton INSTANCE = new RegisterSingleton();
	}

	private RegisterSingleton() {

	}

	public static final RegisterSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
