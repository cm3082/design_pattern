package behavioral.template_method;

public class Test {
	public static void main(String[] args) {
		AbstractCalculator c = new Plus();
		System.out.println(c.calculate("2+8", "\\+"));
	}
}
