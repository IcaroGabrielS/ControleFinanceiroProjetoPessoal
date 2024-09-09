package main;
import java.util.Scanner;

public class MainSistema {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
	
	public String menuPrincipal(Scanner sc) {
		System.out.println("Receitas: R");
		System.out.println("Despesas: D");
		String saida = sc.nextLine().toUpperCase();
		return saida;
	}
	
	public String subMenuR() {
		
	}
	
	public String subMenuD() {
		
	}

}

