package prjAula02;
import java.util.Scanner;

public class SomaDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Cálculo de dois valores.");
		
		System.out.println("Digite o o primeiro número:");
		valor1 = ler.nextInt();
		
		System.out.println("Digite o segundo número:");
		valor2 = ler.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("Resultado da soma = " + soma);
		
		ler.close();
	}

}
