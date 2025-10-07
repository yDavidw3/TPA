package prjAula1108;

import java.util.Scanner;

public class ProgramaTabuada {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		int i=1, r, n;
		System.out.println("Digite o número para apresentar a tabuada:");
		n= ler.nextInt();
		do {
			r = n*i;
			System.out.println(r);
			i++;
		} while (i<=10);
		ler.close();
	} 
}
