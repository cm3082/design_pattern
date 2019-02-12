package creational.builder;

public class MealA extends MealBuilder {

	@Override
	public void buildFood() {
		super.getMeal().setFood("∫∫±§");

	}

	@Override
	public void buildDrink() {
		getMeal().setDrink("ø…¿÷");

	}

}
