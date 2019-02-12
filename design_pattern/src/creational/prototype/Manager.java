package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

	private Map<String, Product> showcase = new HashMap<>();

	public void register(String name, Product p) {
		showcase.put(name, p);
	}

	public Product create(String name) {
		Product p = showcase.get(name);
		return p.createClone();
	}
}
