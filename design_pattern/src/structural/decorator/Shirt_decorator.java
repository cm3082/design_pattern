package structural.decorator;

public class Shirt_decorator implements People{

	private People people;
	
	public Shirt_decorator(People people) {
		this.people = people;
	}

	@Override
	public void wear() {
		people.wear();
		System.out.println("´©¸ö³ÄÉÀ");	
	}
	
	
}
