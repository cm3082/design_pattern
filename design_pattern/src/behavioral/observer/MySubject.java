package behavioral.observer;

public class MySubject extends AbstractSubject {


	
	@Override
	public void operation() {
		System.out.println("��Ҫ����");
		super.notifyObserver();
	}
}
