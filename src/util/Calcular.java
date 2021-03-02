package util;

public class Calcular {
	public final double PI = 3.14159;

	public double Circunferencia(double raio) {
		return 2 * PI * raio;
	}

	public double Volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}
}