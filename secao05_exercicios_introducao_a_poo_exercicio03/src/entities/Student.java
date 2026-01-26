package entities;

public class Student {

	public String name;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;

	public double finalGrade() {
		return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}

	public double missingPoints() {
		double result;
		if (finalGrade() < 60) {
			result = 60.0 - finalGrade();
		} else {
			result = 0;
		}
		return result;
	}
}
