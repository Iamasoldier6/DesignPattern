public class Singleton {
	public static void main(String[] args) {}
}

// 饿汉式单例类，在类初始化时，自行实例化
class EagerSingleton {
	private EagerSingleton() {}
	private static final EagerSingleton eagerSingle = new EagerSingleton();
	// 静态工厂方法
	public static EagerSingleton getInstance() {
		return eagerSingle;
	}
}

// 懒汉式单例类，在第一次调用的时候实例化自己
class LazySingleton {
	private LazySingleton() {}
	private static LazySingleton lazySingle = null;
	// 静态工厂方法
	public static LazySingleton getInstance() {
		if (lazySingle == null) {
			lazySingle = new LazySingleton();
		}
		return lazySingle;
	}
}
