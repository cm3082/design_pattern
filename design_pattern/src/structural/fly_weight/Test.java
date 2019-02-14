package structural.fly_weight;

public class Test {
	public static void main(String[] args) {
		FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("0");
		FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("0");

		System.out.println(flyWeight.hashCode());
		flyWeight.action("0");
		System.out.println(flyWeight1.hashCode());
		flyWeight.action("1");
	}
}
