package prjAula1108;

import java.util.Scanner;

public class IdadeContador {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, idade, maior, menor;
		
		maior = 0;
		menor = 0;
		i = 1;
		
		do {
			System.out.println("Entre com a idade do " + i + "º aluno:");
			idade = ler.nextInt();
		if (idade >= 18) {
			maior = maior + 1;
		}else {
			menor = menor + 1;
		}
		i++;
		} while (i <=5);
		System.out.println("São " + maior + " maiores e idade e " + menor + " menores de idade.");
		
		ler.close();
	}

}
