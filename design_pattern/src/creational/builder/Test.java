package creational.builder;

public class Test {

	public static void main(String[] args) {
		// �ײ�A
		MealA a = new MealA();
		// ׼���ײ�A�ķ���Ա
		Waiter waiter = new Waiter(a);

		Meal MealA = waiter.construct();
		System.out.println(MealA);

	}
}
