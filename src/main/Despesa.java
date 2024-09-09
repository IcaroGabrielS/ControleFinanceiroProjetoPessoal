package main;

public class Despesa {
	String valor;
	String motivo = "Não Especificado";
	String data;
	
	// Crédito ou Débtio.
	String tipo;
	
	public Despesa(String valor, String motivo, String data, String tipo) {
		this.valor = valor;
		this.motivo = motivo;
		this.data = data;
		this.tipo = tipo;
	}
	
	public Despesa(String valor, String data, String tipo) {
		this.valor = valor;
		this.data = data;
		this.tipo = tipo;
	}
	
	
	public double getValor() {
		double valorLocal = Double.parseDouble(this.valor);
		return valorLocal;
	}
	
	@Override
	public String toString() {
		return String.format("Valor: %s. Data: %s. Motivo: %s.", valor, data, motivo);
	}
	
}
