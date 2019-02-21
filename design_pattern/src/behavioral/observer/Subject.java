package behavioral.observer;

public interface Subject {
	void add(Observer observer);
	void del(Observer observer);
	void notifyObserver();
	void operation();
}
