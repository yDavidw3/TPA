package prjAula1108;

import java.util.Scanner;

public class SequenciaNumerica {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		
		n = 1;
		
		System.out.println("Digite algum número para iniciar a sequência:");
		n = ler.nextInt();
		
		do {
			n++;
			System.out.println(n);
		} while (n < 100);
		ler.close();
	}
}

