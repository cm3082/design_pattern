package creational.builder;

public class MealB extends MealBuilder {

	@Override
	public void buildFood() {
		getMeal().setFood("ɳ��");

	}

	@Override
	public void buildDrink() {
		getMeal().setDrink("ţ��");

	}

}
