package de.calc.control;

public class CalcControl {

	public double addiere(double a, double b) {
		return a + b;
	}

	public double subtrahiere(double a, double b) {
		return a - b;
	}

	public double multipliziere(double a, double b) {
		return a * b;
	}

	public double dividiere(double a, double b) {
		if (b != 0)
			return a / b;
		else {
			System.out.println("Nicht g�ltige Eingabe");
			return 0;
		}
	}
}