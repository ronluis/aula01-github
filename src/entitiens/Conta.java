package entitiens;

public class Conta {
	private int numero;
	private String cliente;
	private double saldo;
	
	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(int numero, String cliente, double depositoInicial) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		deposito(depositoInicial);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Conta: " + numero
			 + ", Cliente: " + cliente
			 + ", Saldo: " + String.format("%.2f", saldo);
	}
	
}
