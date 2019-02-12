package creational.singleton;

public class LazySingleton {

	private static LazySingleton uniqueInstance;

	private LazySingleton() {
		System.out.println("啊~~不要啊~~我不想被看见~~我好懒");
	}

	// 1. 没有加入synchronized关键字的版本是线程不安全的
	public static LazySingleton getInstance_1() {

		if (uniqueInstance == null) {
			return new LazySingleton();
		} else {
			return uniqueInstance;
		}
	}

	// 2. 线程安全的
	public static synchronized LazySingleton getInstance_2() {
		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}
		return uniqueInstance;
	}

	// 3. 双重检查加锁（double-checked locking）
	// volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
	private volatile static LazySingleton uniqueInstance3;

	public static LazySingleton getInstance_3() {
		// 检查实例，如果不存在，就进入同步代码块
		if (uniqueInstance3 == null) {
			// 只有第一次才彻底执行这里的代码
			synchronized (LazySingleton.class) {
				// 进入同步代码块后，再检查一次，如果仍是null，才创建实例
				if (uniqueInstance3 == null) {
					uniqueInstance3 = new LazySingleton();
				}
			}
		}
		return uniqueInstance3;
	}

	// 4. 登记式/静态内部类方式
	// 只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化
	// instance（只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）。
	private static class SingletonHolder {
		private static final LazySingleton INSTANCE = new LazySingleton();
	}

	public static final LazySingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
