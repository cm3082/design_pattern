package structural.fly_weight;

import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

	private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<>();

	public static FlyWeight getFlyWeight(String name) {
		if (allFlyWeight.get(name) == null) {
			synchronized (allFlyWeight) {
				if (allFlyWeight.get(name) == null) {
					allFlyWeight.put(name, new ConcreteFlyWeight(name));
				}
			}
		}
		return allFlyWeight.get(name);
	}
}
