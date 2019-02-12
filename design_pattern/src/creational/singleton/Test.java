package creational.singleton;

public class Test {

	public static void main(String[] args) {
		LazySingleton.getInstance();
		EagerSingleton.INSTANCE.doSomeThing();
		
	}
}
