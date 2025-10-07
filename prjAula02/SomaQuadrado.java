package prjAula02;
import java.util.Scanner;

public class SomaQuadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int Valor1, Valor2, Valor3, Valor1q, Valor2q, Valor3q, ValorFinal;
		
		System.out.println("Bem-vindo(a) ao programa que soma o quadrado de três números inteiros!");
		
		//Pegando os valores.
		System.out.println("Para isso, digite os números:");
		Valor1 = ler.nextInt();
		
		Valor2 = ler.nextInt();
		
		Valor3 = ler.nextInt();
		
		//Calculando o quadrado.
		Valor1q = Valor1 * Valor1;
		
		Valor2q = Valor2 * Valor2;
		
		Valor3q = Valor3 * Valor3;
		
		ValorFinal = Valor1q + Valor2q + Valor3q;
		
		//Exibição da soma dos quadrados.
		System.out.println("O resultado é --> " + ValorFinal);
		
		ler.close();
		
		
		
		
		
	}

}
