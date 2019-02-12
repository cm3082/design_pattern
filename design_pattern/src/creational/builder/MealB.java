package creational.builder;

public class MealB extends MealBuilder {

	@Override
	public void buildFood() {
		getMeal().setFood("É³À­");

	}

	@Override
	public void buildDrink() {
		getMeal().setDrink("Å£ÄÌ");

	}

}
