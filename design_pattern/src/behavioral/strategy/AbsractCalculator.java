package behavioral.strategy;

public abstract class AbsractCalculator {

	public int[] splitExp(String exp, String option) {
		String[] array = exp.split(option);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
