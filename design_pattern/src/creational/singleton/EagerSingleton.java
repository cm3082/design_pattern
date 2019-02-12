package creational.singleton;

/*public class EagerSingleton {

	// 在静态初始化器中创建单例实例，这段代码保证了线程安全
	private static EagerSingleton uniqueInstance = new EagerSingleton();

	// Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
	private EagerSingleton() {
		System.out.println("啊~~不要啊~~我不想被看见~~我好饿");
	}

	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}
}*/

public enum EagerSingleton {
	// 定义一个枚举的元素，它就是 Singleton 的一个实例
	INSTANCE;

	public void doSomeThing() {
		System.out.println("啊~~不要啊~~我不想被看见~~我好饿");
	}
}
