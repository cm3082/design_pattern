package behavioral.strategy;

public class Test {

	public static void main(String[] args) {
		String exp = "19*19";
		ICalculator c = new Mutiply();
		c.calculate(exp);
	}
}
