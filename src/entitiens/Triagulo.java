package entitiens;

public class Triagulo {
	public double a, b, c;

	// Como n�o precisa de nenhuma variavel externa a classe, estas ja est�o na
	// clase ou seja a,b,c - teremos apenas o retorno.
	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
