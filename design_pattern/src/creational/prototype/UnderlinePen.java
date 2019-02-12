package creational.prototype;

public class UnderlinePen implements Product {

	private char decochar;

	public UnderlinePen(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("  " + s + "  ");
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
