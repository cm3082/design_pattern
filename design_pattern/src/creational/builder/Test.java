package creational.builder;

public class Test {

	public static void main(String[] args) {
		// 套餐A
		MealA a = new MealA();
		// 准备套餐A的服务员
		Waiter waiter = new Waiter(a);

		Meal MealA = waiter.construct();
		System.out.println(MealA);

	}
}
