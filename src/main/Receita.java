package main;

public class Receita {
	String valor;
	String fonte;
	String data;
	
	public Receita(String valor, String fonte, String data) {
		this.valor = valor;
		this.fonte = fonte;
		this.data = data;
	}
	
	public double getValor() {
		double valorLocal = Double.parseDouble(this.valor);
		return valorLocal;
	}
	
	@Override
	public String toString() {
		return String.format("Valor %s. Data: %s. Fonte: %s", valor, data, fonte);
	}
}
