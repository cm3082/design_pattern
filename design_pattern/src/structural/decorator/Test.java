package structural.decorator;

public class Test {

	public static void main(String[] args) {
		People people = new Jane();
		Shirt_decorator d = new Shirt_decorator(people);
		d.wear();
	}
}
