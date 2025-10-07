package prjAula09;
import java.util.Scanner;
public class programaFatorial {
	public static void main (String[] args) {
		int n, fat=1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número para apresentar seu fatorial:");
		n = ler.nextInt();
		int i=n;
		do {
			fat=fat*i;
			i--;
		} while (i>0);
		System.out.println("o fatorial de " +n+ " é " +fat);
		ler.close();
	} 
}
