package prjAula03;
import java.util.Scanner;

public class salarioUsuario {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double salarioUser, salarioMinimo;
		
		System.out.println("Seu salário está maior ou menor que o salário mínimo atual?");
		System.out.println("Para isso, digite seu salário:");
		salarioUser = ler.nextDouble();
		
		salarioMinimo = 1302.00;
		
		System.out.println("Seu salário é");
		if (salarioUser < salarioMinimo) {
			System.out.println("menor que um salário mínimo.");
		} else if (salarioUser == salarioMinimo) {
			System.out.println("um salário minimo!");
		}else{
			System.out.println("maior do que o salário mínimo!");
		}
		
		ler.close();
	}

}
