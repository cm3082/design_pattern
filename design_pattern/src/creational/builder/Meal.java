package creational.builder;

public class Meal {

	private String Food;
	private String drink;

	public String getFood() {
		return Food;
	}

	public void setFood(String food) {
		Food = food;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "Meal [Food=" + Food + ", drink=" + drink + "]";
	}

	
}
