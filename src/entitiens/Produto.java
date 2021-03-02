package entitiens;

public class Produto {
	public String nome;
	public Double preco;
	public int qtde;

	public Produto(String nome, Double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Double totalValorEstoque() {
		return preco * qtde;
	}

	public void adicionsQtdeProduto(int qtde) {
		// this para indentificar q este qtde e da classe.
		this.qtde += qtde;
	}

	public void subtrairQtdeProduto(int qtde) {
		this.qtde -= qtde;
	}

	public String toString() {
		return nome + ", R$ " 
	                + String.format("%.2f", preco)  
	                + ", " 
	                + qtde 
	                + " unidade(s), Valor Total: R$ " 
	                + String.format("%.2f", totalValorEstoque());
	}
}
