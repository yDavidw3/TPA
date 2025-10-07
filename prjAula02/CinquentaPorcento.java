package prjAula02;
import java.util.Scanner;

public class CinquentaPorcento {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double Valor1, CinquentaPorcento;
		
		System.out.println("Esse programa calcula e apresenta 50% de qualquer valor.");
		
		System.out.println("Insira o primeiro valor:");
		Valor1 = ler.nextDouble();
		
		CinquentaPorcento = Valor1 * 0.50;
		
		System.out.println("50% do valor inserido = " + CinquentaPorcento);
		
		ler.close();
	}

}
