package structural.bridge;

public class Test {

	public static void main(String[] args) {
		Pen pen = new SmallPen();
		pen.setColor(new Red());
		pen.draw("»¨");
	}

}
