package prjAula09;
import java.util.Scanner;
public class programaFibonacci {
	public static void main(String[] args) {
		int n, atual=1, ant=0, i=1, suc;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o termo:");
		n = ler.nextInt();
		System.out.println("Sequência de Fibonacci:");
		do {	
			suc=atual+ant;
			ant=atual;
			atual=suc;
			System.out.print(ant+", ");
			i++;
			} while (i<=n);
		ler.close();
	}
}