package prjAula03;
import java.util.Scanner;

public class PositivoNegativoNeutro {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, neutro;
		
		System.out.println("Informe um número! Esse programa dirá se ele é negativo, neutro ou positivo.");
		numero = ler.nextInt();
		
		neutro = 0;
		
		System.out.println("O número é:");
		if (numero < neutro) {
			System.out.println("negativo");
		}else if (numero == neutro) {
			System.out.println("neutro (zero)");
		}else {
			System.out.println("positivo");
		}
		ler.close();
	}

}
