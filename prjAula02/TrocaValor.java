package prjAula02;
import java.util.Scanner;

public class TrocaValor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double Valor1, Valor2, Valor3;
		
		System.out.println("Olá! Vou trocar os valores que você digitar. Mas para isso, preciso que");
		
		System.out.println("digite o valor 1");
		Valor1 = ler.nextDouble();
		
		System.out.println("Agora, quero que digite o valor 2");
		Valor2 = ler.nextDouble();
		
		Valor3 = 0;
		
		Valor3 = Valor1;
		Valor1 = Valor2;
		Valor2 = Valor3;
		
		System.out.println("Ótimo! Agora os valores estão trocados. O valor 1 é = " + Valor1 + " e o valor 2 é = " + Valor2);
		ler.close();
	}

}
