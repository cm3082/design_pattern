package structural.bridge;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		
		String penType = "С��";
		getColor().bePainted(penType, name);
		
	}
}
