package prjAula09;
import java.util.Scanner;
public class programaPotenciacao {
	public static void main(String[] args) {
		int b, e, r=1, i=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a base");
		b = ler.nextInt();
		System.out.println("Digite o expoente:");
		e = ler.nextInt();
		do {
			r=r*b;
			i++;
			} while (i<e);
		System.out.println("O resultado da potenciação é: "+r);
		ler.close();
	}
}