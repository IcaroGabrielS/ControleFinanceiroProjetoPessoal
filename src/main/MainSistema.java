package main;
import java.util.Scanner;

public class MainSistema {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SisController sistema = new SisController();
	}
	
	public String menuPrincipal(Scanner sc) {
		System.out.println("Receitas: R");
		System.out.println("Despesas: D");
		String saida = sc.nextLine().toUpperCase();
		return saida;
	}
	
	public String subMenuR() {
		return "adicionar receita";
		//return "listar receitas";
	}
	
	public String subMenuD() {
		return "adicionar despesa atual";
		//adicionar despesas (Crédito)
		//adicionar despesas (Débito)
		//listar despesas (Crédito)
		//listar despesas (Débito)
		//listar despesas (Totais)
	}

}

