package com.grwts.depricated;

public class DepricatedImplimentation {
	@Deprecated
	private int number1 = 1000;
	private int number2 = 20;

	public int add() {
		return number1 + number2;
	}

	@Deprecated(since = "1.5",forRemoval = true)
	public int sub() {
		return number1 - number2;
	}

	public int div() {
		return number1 / number2;
	}

	public int mul() {
		return number1 * number2;
	}

	@Deprecated(since = "1.9", forRemoval = true)
	public DepricatedImplimentation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public DepricatedImplimentation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
