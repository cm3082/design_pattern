package creational.builder;

public abstract class MealBuilder {

	private Meal meal = new Meal();

	public abstract void buildFood();

	public abstract void buildDrink();

	public Meal getMeal() {
		return this.meal;
	}
}
