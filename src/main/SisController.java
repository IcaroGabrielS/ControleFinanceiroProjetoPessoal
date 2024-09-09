package main;

import java.util.LinkedList;

public class SisController {
	
	LinkedList<Receita> receitas;
	LinkedList<Despesa> despesasCredito;
	LinkedList<Despesa> despesasDebito; 
	
	public SisController() {
		this.receitas = new LinkedList<>();
		this.despesasCredito = new LinkedList<>();
		this.despesasDebito = new LinkedList<>();
	}
	
	public String addReceita(String valor, String fonte, String data) {
		Receita receitaLocal = new Receita(valor, fonte, data);
		this.receitas.add(receitaLocal);
		return "RECEITA ADICIONADA.";
	}
	
	public String addDespesaCredito(String valor, String motivo, String data, String tipo) {
		Despesa despesa = new Despesa(valor, motivo, data, tipo);
		this.despesasCredito.add(despesa);
		return "DESPESA ADICIONADA.";
	}
	
	public String addDespesaDebito(String valor, String motivo, String data, String tipo) {
		Despesa despesa = new Despesa(valor, motivo, data, tipo);
		this.despesasDebito.add(despesa);
		return "DESPESA ADICIONADA.";
	}
	public double valorReceitasTotaisDoMes() {
		double total = 0;
		for(Receita receita : this.receitas) {
			total += receita.getValor();
		}
		return total;
	}
	
	public double valorDespesasCreditoTotaisDoMes() {
		double total = 0;
		for(Despesa despesa: this.despesasCredito) {
			total += despesa.getValor();
		}
		return total;
	}
	
	public double valorDespesasDebitoTotaisDoMes() {
		double total = 0;
		for(Despesa despesa: this.despesasDebito) {
			total += despesa.getValor();
		}
		return total;
	}
	
	public String listaReceitas() {
		 StringBuilder sb = new StringBuilder();
		 int contReceitas = 1;
		 for(Receita receita : this.receitas) {
			 sb.append(contReceitas);
			 sb.append(". ");
			 contReceitas += 1;
			 sb.append(receita.toString());
			 sb.append("\n");
		 }
		 return sb.toString();
	}
	
	public String listaDespesasCredito() {
		 StringBuilder sb = new StringBuilder();
		 int contReceitas = 1;
		 for(Despesa despesa: this.despesasCredito) {
			 sb.append(contReceitas);
			 sb.append(". ");
			 contReceitas += 1;
			 sb.append(despesa.toString());
			 sb.append("\n");
		 }
		 return sb.toString();
	}
	
	public String listaDespesasDebito() {
		 StringBuilder sb = new StringBuilder();
		 int contReceitas = 1;
		 for(Despesa despesa: this.despesasDebito) {
			 sb.append(contReceitas);
			 sb.append(". ");
			 contReceitas += 1;
			 sb.append(despesa.toString());
			 sb.append("\n");
		 }
		 return sb.toString();
	}
	
	public String valorEmConta() {
		
	}
	
	
	
	
}
