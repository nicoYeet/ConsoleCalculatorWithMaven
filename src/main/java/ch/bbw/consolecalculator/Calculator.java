package ch.bbw.consolecalculator;

public class Calculator {
	
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	
	public int subtraktion(int value1, int value2) {
		return value1 - value2;
	}
	
	public double division(int value1, int value2) {
		return value1 / value2;
	}
	
	protected int multiplikation(int value1, int value2) {
		return value1 * value2;
	}
	
	int quadrieren(int value1) {
		return value1 * value1;
	}
}
