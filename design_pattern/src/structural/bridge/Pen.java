package structural.bridge;

public abstract class Pen {

	private Color color;

	public abstract void draw(String name);

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
