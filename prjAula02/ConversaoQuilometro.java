package prjAula02;
import java.util.Scanner;

public class ConversaoQuilometro {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double Metro, Quilometro;
		
		System.out.println("Esse programa converte metros em Quilômetros.");
		
		System.out.println("Insira a quantidade de metros:");
		Metro = ler.nextDouble();
		
		Quilometro = Metro/1000;
		
		System.out.println("CONVERSÃO BEM-SUCEDIDA! São " + Quilometro + "KM.");
		ler.close();
	}

}
