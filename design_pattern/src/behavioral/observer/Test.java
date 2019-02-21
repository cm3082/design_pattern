package behavioral.observer;

public class Test {
	public static void main(String[] args) {
		Subject m = new MySubject();
		
		Observer o1 = new Observer1();
		Observer o2 = new Observer2();
		m.add(o1);
		m.add(o2);
		m.operation();
	}
}
