package prjAula09;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		int i=2;
		double n1, n2, media;
		Scanner ler = new Scanner (System.in);
		do {
			System.out.println("Entre com a primeira nota do aluno:");
			n1 = ler.nextDouble();
			System.out.println("Entre com a segunda nota do aluno:");
			n2 = ler.nextDouble();
			media = (n1+n2)/2;
			System.out.println("Media = "+media);
			System.out.println("Deseja continua? 1-Sim / 2-Não");
			i=ler.nextInt();
		} while (i==1);
		ler.close();
	}

}
