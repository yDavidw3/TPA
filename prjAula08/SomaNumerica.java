package prjAula1108;

import java.util.Scanner;

public class SomaNumerica {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, soma, i;
		
		i = 1;
		soma = 0;
		n = 0;
		
		System.out.println("Insira algum número para que começe a soma numérica.");
		n = ler.nextInt();
		
		do {		
			soma = soma + n;
			i++;
			System.out.println(soma);
		} while (i <= 100);
		ler.close();
	}

}
