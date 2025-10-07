package prjAula02;
import java.util.Scanner;

public class TrianguloRetangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double base, altura, area;
		
		System.out.println("Digite o valor da base:");
		base = ler.nextDouble();
		
		System.out.println("Digite o valor da altura:");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A área é correspondente a --> " + area);
		ler.close();
	}

}
