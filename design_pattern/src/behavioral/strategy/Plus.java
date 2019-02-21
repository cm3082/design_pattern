package behavioral.strategy;

public class Plus extends AbsractCalculator implements ICalculator {

	@Override
	public void calculate(String exp) {
		String option = "\\+";
		int[] arrayInt = super.splitExp(exp, option);
		System.out.println("½á¹ûÊÇ:" + (arrayInt[0] + arrayInt[1]));
	}

}
