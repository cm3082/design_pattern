package behavioral.observer;

public class MySubject extends AbstractSubject {


	
	@Override
	public void operation() {
		System.out.println("我要干了");
		super.notifyObserver();
	}
}
