package behavioral.strategy;

public class Mutiply extends AbsractCalculator implements ICalculator {

	@Override
	public void calculate(String exp) {
		String option = "\\*";
		int[] arrayInt = super.splitExp(exp, option);
		System.out.println("�����:" + (arrayInt[0] * arrayInt[1]));
	}

}
