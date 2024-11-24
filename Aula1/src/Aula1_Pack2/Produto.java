package Aula1_Pack2;

public class Produto {
	
	private String descricao;
	private double quantidade;
	private double valor;
	
	public Produto() {
		
	}
	
	public Produto(String descricao, double quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.quantidade = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}	

}
