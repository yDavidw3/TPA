package prjAula03;
import java.util.Scanner;

public class AprovadoReprovado {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double n1, n2, m;
		
		System.out.println("Entre com a 1ª nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Entre com a 2ª nota:");
		n2 = ler.nextDouble();
		
		m = (n1+n2)/2;
		
		System.out.println("A média é: "+m);
		if (m<4) {
			System.out.println("Você está reprovado!");
		}else if (m<6) {
			System.out.println("Você está de recupeação!");
		}else {
			System.out.println("Você está aprovado!");
		}
	}

}
