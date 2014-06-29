package de.calc.control;

import de.calc.view.CalcView;

public class CalcControl {
	
	public static void main(String[] args) {
		new CalcView();
	}

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
			System.out.println("Nicht gültige Eingabe");
			return 0;
		}
	}
}