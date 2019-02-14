package structural.bridge;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		
		String penType = "Ð¡±Ê";
		getColor().bePainted(penType, name);
		
	}
}
